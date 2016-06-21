
package game;

public class ThreadRun implements Runnable{
    private Cell grid[][];
    private Cell next_grid[][];
    private int tam,lin,col;
    private Cell celula;
   

public ThreadRun(Cell grid[][],int lin,int col,int tam){
    this.tam=tam;
    this.lin=lin;
    this.col=col;
    Cell next_grid[][] = new Cell[tam][tam];
    for(int i = 0; i < tam; i++){
        for(int j=0; j < tam; j++){
            next_grid[i][j].setTipo(grid[i][j].getTipo());
        }
    } 

}

    @Override
    public void run() {
        NumeroVizinhos vizinhos = new NumeroVizinhos();
        NextGrid proximo = new NextGrid();
        synchronized (this){
        for(int i = 0; i < tam; i++){
            for(int j=0; j < tam; j++){
                next_grid[i][j].setVizinhos_vivos(vizinhos.numeroVizinhosVivos(grid,i,j,tam));
                next_grid[i][j].setVizinhos_zumbis(vizinhos.numeroVizinhosZumbis(grid,i,j,tam));
                
            }
        }
        for(int i=0;i<tam;i++){
               for(int j=0;j<tam;j++){
            next_grid[i][j].setTipo(proximo.Next(grid[i][j]));
               }
        }
        throw new UnsupportedOperationException("Not supported yet.");
        
        
        
        
        
    }
  }
}

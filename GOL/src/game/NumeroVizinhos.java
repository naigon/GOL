
package game;
/*CLASSE QUE POSSUI O METODO QUE IRÁ CALCULAR O NUMERO DE VIZINHOS
VIVOS E ZUMBIS, CECEBENDO O GRID CORRESPONDENTE AQUELA ITERAÇÃO E SUA DIMENSÃO
*/
public class NumeroVizinhos {
  
    
    public int numeroVizinhosVivos(Cell grid[][], int lin,int col,int tam){
        
        int numVivo=0;
        int linha;
        int coluna;
        
        linha=lin;
        coluna=col+1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==1){
            numVivo++;
        }
        
        linha=lin+1;
        coluna=col+1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==1){
            numVivo++;
        }
        
        linha=lin+1;
        coluna=col;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==1 ){
            numVivo++;
        }
        
        linha=lin+1;
        coluna=col-1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==1){
            numVivo++;
        }
        
        linha=lin;
        coluna=col-1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==1){
            numVivo++;
        }
        
        linha=lin-1;
        coluna=col-1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==1){
            numVivo++;
        }
        
        linha=lin-1;
        coluna=col;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==1 ){
            numVivo++;
        }
        
        linha=lin-1;
        coluna=col+1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==1 ){
            numVivo++;
        }
    
        return numVivo;
    }
    
    public int numeroVizinhosZumbis(Cell grid[][], int lin,int col,int tam){
        int numZumbi=0;
        int linha;
        int coluna;
        
        linha=lin;
        coluna=col+1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==2){
            numZumbi++;
        }
        
        linha=lin+1;
        coluna=col+1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==2){
            numZumbi++;
        }
        
        linha=lin+1;
        coluna=col;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==2 ){
            numZumbi++;
        }
        
        linha=lin+1;
        coluna=col-1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==2){
            numZumbi++;
        }
        
        linha=lin;
        coluna=col-1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==2){
            numZumbi++;
        }
        
        linha=lin-1;
        coluna=col-1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==2){
            numZumbi++;
        }
        
        linha=lin-1;
        coluna=col;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==2 ){
            numZumbi++;
        }
        
        linha=lin-1;
        coluna=col+1;
        if((linha>=0 && linha<tam)&&(coluna>=0 && coluna<tam))
        if(grid[linha][coluna].getTipo()==2 ){
            numZumbi++;
        }
    
        return numZumbi;
    
    }

    int numeroVizinhosVivos(Cell celula, int lin, int col, int tam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int numeroVizinhosZumbis(Cell celula, int lin, int col, int tam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }




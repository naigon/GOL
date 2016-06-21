package game;

import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class NewMain {

       public static void main(String[] args) {
           
           try {
           int tam = Integer.parseInt(args[0]);//argumanto tamanho do problema
           int count = 1;
           int numIter = Integer.parseInt(args[1]);//numero de iterações
           File entrada = new File(args[2]);//arquivo de entrada que contem a configuração inicial
           File saida = new File(args[3]);//arquivo de saida
           Scanner scan = new Scanner(entrada);//scannner para leitura do arquivo
           Cell grid[][] = new Cell[tam][tam];
           NumeroVizinhos vizinhos = new NumeroVizinhos();//objeto vizinhos
           NextGrid proximo = new NextGrid();
           PrintWriter pw = new PrintWriter(saida);//print para arquivo de saida
                       
           
           for(int i=0; i<tam; i++){//inicializa vetor de celulas[matriz tam x tam]
               for(int j=0; j<tam; j++){
                   grid[i][j]= new Cell();
               }
           }
           //passos para pegar linha por linha do arquivo e setar a o grid de entrada
           for(int i = 0; i < tam*tam; i++){ //numero do problema ao quadrado pra percorrer todas as linhas do arquivo de configuração
                               
                String linha = new String(scan.nextLine());
                String[] vetor = new String [2]; 
		String[] coordenada = new String [2];
                int x, y, tipo;
		vetor = linha.split(" "); //vetor[0] = 1,2     vetor[1] = 3		
		coordenada = vetor[0].split(","); //coordenada[0] = 1    //coordenada[1] = 2
		
		x = Integer.parseInt(coordenada[0]);//x = 1
		y = Integer.parseInt(coordenada[1]);//y = 2
		tipo = Integer.parseInt(vetor[1]);//tipo = 3
		
                grid[x][y].setTipo(tipo);
            }
           
           /*Runnable task = new ThreadRun(grid,tam,tam,tam); 
           Thread worker = new Thread(task);
           worker.start();
           try {
            worker.join();
        } catch (InterruptedException e) {
           System.out.println("Hello Thread");
        }   e.printStackTrace();*/
           
           System.out.println("GRID INICIAL: \n");
            pw.println("GRID INICIAL: \n");
           for(int i=0; i<tam; i++){//imprime grid inicial
               for(int j=0; j<tam; j++){                   
                   System.out.print(grid[i][j].getTipo());//printa o grid inicial na tela e no arquivo de saida
                   pw.print(grid[i][j].getTipo());
                   System.out.print(" ");
                   pw.print(" ");
               }
               System.out.println("");
               pw.println("");
           }
           System.out.println("\n");
           pw.println("\n");
           for(int z=0;z<numIter;z++){//printa cada iteração na tela e no arquivo de saida
               System.out.println("ITERAÇÃO: "+count);
               pw.println("ITERAÇÃO: "+count);

           for(int i=0;i<tam;i++)
               for(int j=0;j<tam;j++){//seta vizinhos usando objeto vizinhos
                   grid[i][j].setVizinhos_vivos(vizinhos.numeroVizinhosVivos(grid,i,j,tam));
                   //seta vizinhos vivos da celula em grid[i][j] chamando metodo numeroVizinhosVivos da classe NumeroVizinhos
                   grid[i][j].setVizinhos_zumbis(vizinhos.numeroVizinhosZumbis(grid,i,j,tam));
                   //seta vizinhos zumbis da celula em grid[i][j] chamando metodo numeroVizinhosZumbis da classe NumeroVizinhos
                   }
           //depois de obter numero de vizinhos vivos e zumbis, o laço abaixo seta o tipo da celula na proxima iteração
           for(int i=0;i<tam;i++){
               for(int j=0;j<tam;j++){
                                  
                   grid[i][j].setTipo(proximo.Next(grid[i][j]));
                   //apos setar o tipo da celula, ja vai imprimindo na tela e guardando na tela o novo grid
                   System.out.print(grid[i][j].getTipo());
                   pw.print(grid[i][j].getTipo());
                   pw.print(" ");
                   System.out.print(" ");
                   
               }
           System.out.println(" ");
           pw.println(" ");
           
           
           }
           count++;
           System.out.println(" ");
           pw.println(" ");
           
           }         
           pw.close();
           }// try// try
       
	   catch (FileNotFoundException e){
		System.out.println("Arquivo nao encontrado.");
	   } 

		
	}

}

   

        
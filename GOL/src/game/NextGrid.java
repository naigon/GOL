
package game;

/*CLASSE QUE POSSUI O METODO QUE RECEBE UMA CELULA CORRENTE 
DO GRID E APLICA AS 8 REGRAS DO JOGO DE ACORDO COM A PRECEDENCIA ESPECIFICADA
E O RESULTADO DO CALCULO DO NUMERO DE VIZINHOS VIVOS E ZUMBIS*/

public class NextGrid {
    int type;
    public int Next(Cell celula){//retorna tipo da celular de acordo com as regras do jogo
    
       
                   
                   if((celula.getTipo() == 1) && ((celula.getVizinhos_zumbis() > 0)||(celula.getVizinhos_vivos() == 8)))
                       type= 2; //vira zumbi
                   else{
                         if((celula.getTipo() == 1) && ((celula.getVizinhos_vivos() < 2)||(celula.getVizinhos_vivos()>3)))   
                         { type=0;}
                         if((celula.getTipo() == 1) && ((celula.getVizinhos_vivos() == 2)||(celula.getVizinhos_vivos()==3)))
                         {type=1;}
                        
                    
                   if((celula.getTipo() == 0) && ((celula.getVizinhos_vivos() == 3)))
                   {type =1;}
                    if((celula.getTipo() == 0) && ((celula.getVizinhos_vivos() != 3)))
                   {type=0;}
                   }
                   if((celula.getTipo() == 2) && ((celula.getVizinhos_vivos() == 0)))
                       type=0;
                   else if((celula.getTipo() == 2) && ((celula.getVizinhos_vivos() >= 1)||(celula.getVizinhos_zumbis() > 0)))
                       type=2;
                    
                     
    
        
   
    return type;
    }
}
    
    



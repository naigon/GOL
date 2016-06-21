package game;

public class Cell {
    
    
    private int tipo;
    //0 = morta
    //1 = viva
    //2 = zumbi
    private int vizinhos_vivos;//contador do numero de vizinhos
    private int vizinhos_zumbis;//contador de vizinhos zumbis
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getVizinhos_vivos() {
        return vizinhos_vivos;
    }
    
    public int getVizinhos_zumbis(){
        return vizinhos_zumbis;
    }

    public void setVizinhos_vivos(int vizinhos_vivos) {
        this.vizinhos_vivos = vizinhos_vivos;
    }
    
    public void setVizinhos_zumbis(int vizinhos_zumbis) {
        this.vizinhos_zumbis = vizinhos_zumbis;
    }

}

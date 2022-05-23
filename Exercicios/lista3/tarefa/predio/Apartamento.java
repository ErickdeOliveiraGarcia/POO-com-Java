package predio;

public class Apartamento {
    private int nro;
    private int andar;

    public Apartamento(){
    }

    public Apartamento(int nro, int andar) {
        this.setNro(nro);
        this.setAndar(andar);
    }
    
    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String toString(){
        return "Número do Apto:"+this.nro+" ,N. Andar:"+this.andar;
    }

}

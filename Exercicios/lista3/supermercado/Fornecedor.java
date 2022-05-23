public class Fornecedor {
    private String nomeproduto;
    private int codigoproduto;

    Fornecedor(){

    }
    public Fornecedor(String nomeproduto, int codigoproduto) {
        this.setNomeproduto(nomeproduto);
        this.setCodigoproduto(codigoproduto);
    }

    public int getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(int codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }
    
    public String toString(){
        return " Codigo do produto:"+this.codigoproduto+" Nome do produto:"+this.nomeproduto;
    }
}

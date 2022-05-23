package exemplosPraticos;

public abstract class Moradia {

    protected String endereco;
    protected String cidade;
    protected float tamanho;

    public Moradia(){
    }

    public Moradia(String endereco, String cidade, float tamanho) {
        this.endereco = endereco;
        this.cidade = cidade;
        this.tamanho = tamanho;
    }
    //getters
    public String getEndereco(){
        return this.endereco;
    }
    public String getCidade(){
        return this.cidade;
    }
    public float getTamanho(){
        return this.tamanho;
    }
    //setters
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }

    //String
    public String toString(){
        return ("Cidade:"+ cidade +" Enderço:"+ endereco +" Tamanho:"+ tamanho);
    }
     //metodo
    public abstract void CalcularPreco();

}

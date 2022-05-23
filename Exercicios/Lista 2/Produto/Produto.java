package Produto;

public class Produto{
    private int id, qtde;
    private float preco;
    private String descricao;
//----------------------------------
    public Produto(){

    }
    public Produto(int id, int qtde, float preco, String descricao){
        this.setId(id);
        this.setQtde(qtde);
        this.setPreco(preco);
        this.setDescricao(descricao);
    }
    /*public Produto(int id, int qtde, float preco, String descricao){
        this.id = id;
        this.qtde = qtde;
        this.preco = preco;
        this.descricao = descricao;
    }*/
    //--setters-----------------------
    public void setId(int id){
        if(id >0){
        this.id = id;
        } else System.out.println(" Id invalido ");
    }
    public void setQtde(int qtde){
        if(qtde >= 0){
        this.qtde = qtde;
        } else System.out.println(" Qtde invalido ");
    }
    public void setPreco(float preco){
        if(preco >= 0){
            this.preco = preco;
        } else System.out.println(" Preco invalido ");
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
//------------------------------------
public int getId(){
    return this.id;
}
public int getQtde(){
    return this.qtde;
}
public float getPreco(){
    return this.preco;
}
public String getDescricao(){
    return this.descricao;
}
//--------------------------------------
    public void comprar( int x){
        this.qtde +=x;
    }
    public void vender(int x){
        this.qtde -=x;
    }
    public void subir(float x){
        this.preco +=x;
    }
    public void descer(float x){
        setPreco(x);
        this.preco -=x;
    }
    public String mostra(){
        return " id: "+ this.id + " Descricao " + this.descricao + " Qtde: " + this.qtde + " Preco "
         + this.preco;
    }
}
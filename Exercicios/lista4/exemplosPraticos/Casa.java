package exemplosPraticos;

//package exemplosPraticos;

public class Casa extends Moradia{

    protected float tamQuintal;
    protected boolean piscina;
    private int acres;

    public Casa(){
        super();
    }
    public Casa(String endereco, String cidade, float tamanho, float tamQuintal, boolean piscina){
        super( endereco, cidade, tamanho);
        this.setTamQuintal(tamQuintal);
        this.setPiscina(piscina);
    }
    public float getTamQuintal(){
        return tamQuintal;
    }
    public void setTamQuintal(float tamQuintal){
        this.tamQuintal = tamQuintal;
    }
    public boolean isPiscina(){
        return piscina;
    }
    public void setPiscina(boolean piscina){
        //this.piscina = piscina;
 
    }

    @Override
/*
    public String toString(){
        return super.toString()+ "Tamanho do quintal "+ this.tamQuintal +" Tem piscina ? "+this.piscina;
    }
    public void CalcularPreco() {
        float precoM2 = this.tamanho * 500; 
        float precoTamanho = this.tamanho * 100;

        if(this.piscina){ //se tiver true ele entrara na primaira, e false na segunda.
        this.acres =+ 1000;
         }


        float somaCasa = (this.precoM2 + this.precoTamanho + this.acres);
        System.out.println("Valor da casa: "+this.somaCasa);
*/   
        float precoCasa = (this.tamanho * 500) + this.tamQuintal * 100
        if(this.piscina){
            aux = aux + 1000;
        }
        System.out.print("Preco da casa: "+ aux)
        
    }
}
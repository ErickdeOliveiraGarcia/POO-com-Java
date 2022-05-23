package exemplosPraticos;

public class Apto extends Moradia{

    protected int nro;
    protected int andar;
    private int acresNro;
    private int acresAndar;

    public Apto(){
    }
    public Apto(String endereco, String cidade, float tamanho, int nro, int andar) {
        super(endereco, cidade, tamanho);
        this.nro = nro;
        this.andar = andar;
    }
    public int getNro(){
        return nro;
    }
    public void setNro(int nro){
        this.nro = nro;
    }
    public int getAndar(){
        return andar;
    }
    public void setAndar(){
        this.andar = andar;
    }


    @Override

    public String toString(){
        return super.toString() + "Número "+nro+ "Andar"+andar;
    }
    public void CalcularPreco() {
        /*
        float precoM2 = this.tamanho * 800; 

        if(this.nro%2 == 0){
        //var acresPiscina =+ 1000;
        float acresNro =+200;
        } acresNro =+300;
       
        if(this.andar > 30){
            //var acresPiscina =+ 1000;
            acresAndar =+ 2000;
            } 
                
        float somaApto = (acresAndar + acresNro + precoM2);
        System.out.println("Valor da Apto: "+somaApto);
       
        
    */
    float precoApto = this.tamanho * 800

    if(this.nro%2 == 2){
        precoApto = precoApto + 200;
    }else
    precoApto = precoApto + 300;

    if(this.andar > 3){
    precoApto = precoApto + 2000;
     } 

    
 System.out.println("Valor da Apto: "+ precoApto);
        
        
    }

}

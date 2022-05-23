public class Carro {
    int ano;
    float velocidade;
    boolean motor;
    String modelo;
    public Carro(){

    };
    public Carro(int ano, String modelo, boolean motor, float velocidade){
        this.ano = ano;
        this.modelo = modelo;
        this.motor = motor;
        this.velocidade = velocidade;
    };

    public void mostra() {
        System.out.println("ano:"+ this.ano + "modelo" + this.modelo + " motor:" + 
        this.motor + "velocidade" + this.velocidade);
        
    };

    public void desligar(){
        this.motor = false;
        this.velocidade = 0;
        this.modelo = false;
    };
    public void acelerar(float x){
        if(!this.motor){
        this.motor = true;

        };
    this.velocidade = this.velocidade + x;
   
    };
    
};
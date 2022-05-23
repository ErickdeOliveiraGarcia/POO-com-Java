public class Cliente {

    public int conta, agencia;
    public String nome;
    public float saldo;

    public Cliente(){
    }
    
public Cliente(int conta, int agencia, String nome, float saldo){
    this.nome = nome;
    this.conta = conta;
    this.agencia = agencia;
    this.saldo = saldo;
}
public void deposito(float x){
    this.saldo = this.saldo + x;
    }
public void realizarSaque(float x){
    this.saldo = this.saldo - x;
}
public String mostrar(){
  return String.format("Nome do cliente: "+ this.nome +" agencia: "+this.agencia+" conta: " 
  +this.conta+" saldo: "+this.saldo);
    }
}
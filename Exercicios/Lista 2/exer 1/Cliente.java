public class Cliente{
    //variaveis de instancia
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
//método constructor
public Cliente(){

}
//--------------------
public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
    this.setnumeroConta(numeroConta);
    this.setnumeroAgencia(numeroAgencia);
    this.setnome(nome);
    this.setsaldo(saldo);
    }

final void setsaldo(float saldo) {
  this.saldo = saldo;
}
final void setnome(String nome) {
    if(nome.length() < 30){
        this.nome = nome;
    }
    else System.out.println("Nome invalida");

}
final void setnumeroAgencia(String numeroAgencia) {
    if(numeroAgencia.length() == 6){
        this.numeroAgencia = numeroAgencia;
    }
    else System.out.println("Agencia invalida");
}

final void setnumeroConta(String numeroConta) {
    if((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')){
        this.numeroConta = numeroConta;
    }
    else System.out.println("Conta invalida");
}

    public float getsaldo() {
        return this.saldo;
    }
    public String getnome(){
        return this.nome;
    }
    public String getnumeroAgencia(){
        return this.numeroAgencia;
    }
    public String getnumeroConta(){
        return this.numeroConta;
    }

    public void realizarDeposito(float x){
        this.setsaldo(this.saldo + x);
    }
    public void realizarSaque(float x){
        this.setsaldo(this.saldo - x);
    }
    public String mostra(){
        return ("Nome: "+this.nome+", número da agencia: "+this.numeroAgencia+", número da conta "+this.numeroConta+
        ", saldo:"+this.saldo);
    }

}

//SETTER--------------------------0
/*
public void setnumeroAgencia(int x){
    for( int i=0; i <= numeroAgencia.length();i++){
         qtdeLetras = numeroAgencia.charAt(i);  
    }
    if(qtdeLetras <= 6){
        this.numeroAgencia = numeroAgencia;
    }
     else System.out.println(" Número da AG invalido ");
}
public void setnumeroConta(int x){
    for(int i=0; numeroConta.length() <= i ;i++){
        qtdeLetras = numeroConta.charAt(i);
    }
    if(qtdeLetras <= 8){
        this.numeroConta = numeroConta;
        } else System.out.println(" Número da Conta invalido ");
    }
public void setnome(int x){
    for(int i=0;nome.length() <= i; i++){
        qtdeLetras = nome.charAt(i);
    }
    if(qtdeLetras <= 30){
        this.nome = nome;
    } else System.out.println(" Número da nome invalido ");
}
public void setsaldo(int x){
    this.saldo += saldo;
}

//Métodos GET---------------------
public String getnumeroConta(){    
    return this.numeroConta;
}
public String  getnumeroAgencia(){
    return this.numeroAgencia;
}
public String getnome(){
    return this.nome;
}
public float getsaldo(){
    return this.saldo;

    }

//Metodos Cáculos
public void realizarDeposito(int x){
    this.saldo += saldo;

}
public void realizarSaque(int x){
    this.saldo -= saldo;
}

}
*/
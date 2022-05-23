package Questao1;

/*1ª. Questão (1,0 pts)

A classe Computador controla a utilização de um computador. O Computador pode estar apenas em
 modo “ligado” ou “desligado”, e possuir apenas 4 tipos de capacidade de memória RAM (4, 8, 16, 32).
  As variáveis devem ser encapsuladas. Assim, escreva códigos na linguagem Java:

· Defina a classe Computador e suas variáveis

· Defina os construtores da classe Computador

· Defina os métodos setters e getters da classe Computador (atenção às restrições dos valores 
das variáveis)*/ 
public class Computador {

    private int memoriaRam;
    private boolean modo;

   public Computador(){
   }

public Computador(int memoriaRam,boolean modo) {
    this.setMemoriaRam(memoriaRam);
    this.setModo(modo);
}

public boolean isModo() {
    return modo;
}
public void setModo(boolean modo) {
    if(modo==true){
        this.modo = modo;
        System.out.println("Ligado");
    }else if(modo==false){
    System.out.println("Desligado");
    this.modo = modo;
    }
}
public int getMemoriaRam() {
    return memoriaRam;
}
public void setMemoriaRam(int memoriaRam) {
   if(memoriaRam == 4){
    this.memoriaRam = memoriaRam;
    System.out.println("Capacidade de 4GB RAM");
   }else if(memoriaRam == 8){
    System.out.println("Capacidade de 8GB RAM");
    this.memoriaRam = memoriaRam;
   }else if(memoriaRam == 16){
    System.out.println("Capacidade de 16GB RAM");
    this.memoriaRam = memoriaRam;
   }else if(memoriaRam == 32){
    System.out.println("Capacidade de 32GB RAM");
    this.memoriaRam = memoriaRam;
   }else System.out.println("Valor inválido");
}



}

public class Aluno {
    private int NumeroAluno, idade;
    private String nome;
    private float p1, p2;

Aluno(){
}

public Aluno(int NumeroAluno, int idade, String nome, float p1, float p2){
    this.setIdade(idade);
    this.setNome(nome);
    this.setNumeroAluno(NumeroAluno);
    this.setP1(p1);
    this.setP2(p2);

}

final void setIdade(int idade) {
    //idade = idade > 0 ? this.idade = idade: System.out.println("E menor que zero");
    if(idade >= 0){
        this.idade = idade;
    } else System.out.print("Nota da idade e menor que zero");
    
}

final void setP2(float p2) {
    //p2 = p2 >= 0 ? this.p2 = p2: System.out.println("Nota e menor que zero");
    if(p2 >= 0){
        this.p2 = p2;
    }
    else{
        System.out.print("Nota da p2 e menor que zero");
    }
    
}

final void setP1(float p1) {
    //p1 = p1 >= 0 ? this.p1 = p1: System.out.println("Nota da p1"+ p1 +"e menor que zero");
  if(p1 >= 0){
        this.p1 = p1;
    }else{
    System.out.print("Nota da p1  menor que zero");
}
    
}

final void setNome(String nome) {
    //nome = (nome > String.lenght()>=6 & String.lenght()<=30) ? this.nome = nome : System.out.println("Nome inválido");
    if(nome.length()<=30){
        this.nome = nome;
    } else {
        System.out.print("Nome não por ter comprimento maior que 30");
    }
}

final void setNumeroAluno(int NumeroAluno) {
    String aux = String.valueOf(NumeroAluno);
    if(aux.length() == 6){
        this.NumeroAluno = NumeroAluno;
    } else System.out.println("Número do aluno invalido");
}
/*
public int getIdade() {
    return idade;
}
public float getP2() {
    return p2;
}
public float getP1() {
    return p1;
}
public String getNome() {
    return nome;
}
public int getNumeroaluno() {
    return numeroaluno;
}
*/

public float notaFinal(){
    return (this.p1 + this.p2)/2;
}
public String toString(){
    return "Número do aluno: "+this.NumeroAluno+" ,Nome : "+this.nome+" ,idade: "+this.idade+", média final é: "+ this.notaFinal();
}
}

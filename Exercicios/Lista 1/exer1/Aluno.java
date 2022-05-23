public class Aluno {
    public int nroAluno;
    public String nome;
    public int idade;
    public float p1, p2;

    public Aluno(){ //Aluno objeto1 = new Aluno();

    }

    public Aluno(int nroAluno, int idade, String nome, float p1, float p2){

        this.nroAluno = nroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    //float retorna e média final do aluno
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;

    }
    //método que retorna os dados do aluno

    public String dadosAluno(){
        return " Número do aluno " + this.nroAluno + " Nome: " + nome + " Idade " + this.idade + 
        " média de aluno " + this.notaFinal();
    }

    public String passou(){
        if(this.notaFinal()>=6){
            return "aprovado";
        }
        else {
            return "reprovado";
        } // reutrn(this.notaFinal()>=6) ? "aprovado" : "reprovado";
    }
}
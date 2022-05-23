public class Funcionario {
    int id;
    String nome;
    float salario;
    
    public Funcionario(){}

    public void inserir(int i,String n,float s){
        id = i;
        nome = n;
        salario = s;
    }
    public String exibir(){
    return String.format(id+""+nome+""+salario);
    }
}

    
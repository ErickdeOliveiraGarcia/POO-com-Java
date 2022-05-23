package streaming;

public class Usuario {

    private String nome;
    private int idade;
    private String sexo;

    public Usuario(){

    }

    public Usuario(String nome, int idade, String sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Nome Usuário:"+this.nome+" ,Idade"+this.idade+" ,Sexo"+this.sexo;
    }
//    public Usuario(String nome, int idade, String sexo){
}

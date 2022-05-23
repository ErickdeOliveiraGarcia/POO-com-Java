package streaming;
public class Filme {

    private String nome;
    private int classificacao;
    private String genero;
    public Filme(){

    }

    public Filme(String nome, int classificacao, String genero) {
        this.setNome(nome);
        this.setClassificacao(classificacao);
        this.setGenero(genero);
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return " ,Nome:"+this.nome+" ,Classificação: "+this.classificacao+" ,Genero:"+this.genero;
    }
}
/*    private String nome;
    private int classificacao;
    private String genero; */
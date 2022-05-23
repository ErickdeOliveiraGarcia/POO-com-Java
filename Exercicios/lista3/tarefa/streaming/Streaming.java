package streaming;

public class Streaming {

    private String nomeFilme;
    private int qtdeUsuarios;
    //Associação
    private Filme filme;
    private Usuario usuario;


    public Streaming(String nomeFilme, int qtdeUsuarios, Filme filme, Usuario usuario) {
        this.setNomeFilme(nomeFilme);
        this.setQtdeUsuarios(qtdeUsuarios);
        this.setFilme(filme);
        this.setUsuario(usuario);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Streaming(){
    }
    
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getQtdeUsuarios() {
        return qtdeUsuarios;
    }

    public void setQtdeUsuarios(int qtdeUsuarios) {
        this.qtdeUsuarios = qtdeUsuarios;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String toString(){
        return "Dados do Filme:"+this.filme.toString()+" \n ,Nome do Filme:"+ this.nomeFilme+
        " Quantidade de Usuários"+this.qtdeUsuarios+"\n"+this.usuario.toString();
    }
}

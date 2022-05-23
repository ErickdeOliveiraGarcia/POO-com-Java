package Questao2;

public class Cliente {

    private String rg;
    private String nome;

    public Cliente(){     
    }

    public Cliente(String rg,String nome) {
        this.setRg(rg);
        this.setNome(nome);
    }
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Nome:"+this.nome+" RG:"+this.rg;
    }

}

package predio;

public class Predio {
    private String nome;
    private String rua;
    //associação
    private ArrayList<Apartamento> apartamento; //vetor dos objetos

    public Predio(){
        this.setApartamento(new ArrayList<Apartamento>());
    }

    public Predio(String nome, String rua) {
        this.setNome(nome);
        this.setRua(rua);

        this.setApartamento(new ArrayList<apartamento>());
    }

private ArrayList<Apartamento> getAlunos(){
    return apartamento;
}
private void setApartamento(ArrayList<Apartamento>apartamento){
    this.apartamento = apartamento;
}

public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getRua(){
    return rua;
}
public void setRua(String rua){
    this.rua = rua;
}

public void addApto(int nro, int andar){
    this.apartamento.add(new Apartamento(nro, andar));
}

public String toString(){
    return "Nome:"+this.nome+" ,Rua:"+this.rua+"\n"+apartamento.toString();
    }
}

//String nome, String rua, ArrayList<Apartamento>apartamento
//int nro, int andar
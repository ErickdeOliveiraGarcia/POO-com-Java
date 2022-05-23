public class Cliente{

 private String nome;
 private int cpf;
 private String formapagamento;
 private int pagamento;

 Cliente(){
    }
 public Cliente(String nome, int cpf, String formapagamento, int pagamento){
    this.setNome(nome);
    this.setCpf(cpf);
    this.setFormapagamento(formapagamento);
    this.setPagamento(pagamento);
    }
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public int getCpf(){
    return cpf;
}
public void setCpf(int cpf){
    this.cpf = cpf;
}
public String getFormapagamento(){
    return formapagamento;
}
public void setFormapagamento(String formapagamento){
    this.formapagamento = formapagamento;
}
public int getPagamento(){
    return pagamento;
}
public void setPagamento( int pagamento){
    this.pagamento = pagamento;
}
    public String toString(){
        return "Nome:"+this.nome+" CPF:"+this.cpf+" Forma de Pagamento:"+this.formapagamento+
        " R$:"+this.pagamento;
    }
}
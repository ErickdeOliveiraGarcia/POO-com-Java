public class Supermercado {

    private int troco;
    //Associação
    private Cliente Cliente;
    private Fornecedor Fornecedor;
    private int pagamento;

    Supermercado(){

    }
    public Supermercado(Cliente Cliente, Fornecedor Fornecedor ) {
        this.setCliente(Cliente);
        this.setFornecedor(Fornecedor);
    }

    public Fornecedor getFornecedor() {
        return Fornecedor;
    }
    public void setFornecedor(Fornecedor Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }
    
    public int getTroco() {
        return troco;
    }
    
    public void setTroco(int troco) {
        if(troco >=0){
        this.troco = troco-pagamento;
        }else {
            System.out.println("Não aceitamos fiado");
        }
    }
    
    public String toString(){
        return this.Cliente.toString()+ this.Fornecedor.toString();
    }
    
}

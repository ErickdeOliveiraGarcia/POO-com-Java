package Questao2;

import java.util.ArrayList;

public class Pedido {

    private int codigo;
    private String data;
    //agregação
    private ArrayList<Cliente> cliente;
    private ArrayList<Unidade> unidade;


    public Pedido(){
        this.setCliente(new ArrayList<Cliente>());
        this.setUnidade(new ArrayList<Unidade>());
    }

    public Pedido(int codigo,String data) {
        this.setCodigo(codigo);
        this.setData(data);

        //aloca
        this.setCliente(new ArrayList<Cliente>());
        this.setUnidade(new ArrayList<Unidade>());
    }

       /* private String rg;
    private String nome;

*/
    private void setUnidade(ArrayList<Unidade> unidade){
    this.unidade = unidade;
    }

    private void setCliente(ArrayList<Cliente> cliente) {
    this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return "Data:"+this.data+" Codigo:"+this.codigo+ this.cliente.toString() + this.unidade.toString();
    }
}

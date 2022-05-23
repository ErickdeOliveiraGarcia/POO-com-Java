package Questao2;

public class TestaPedido {
    public static void main(String args[]){
        Cliente cl1 = new Cliente("54516547","David");

        Unidade un1 = new Unidade("Franca","São Paulo");

        Pedido pe1 = new Pedido(01,"22-09-2021");

        System.out.println(un1.toString());

        System.out.println(cl1.toString());

        System.out.println(pe1.toString());

    }
}

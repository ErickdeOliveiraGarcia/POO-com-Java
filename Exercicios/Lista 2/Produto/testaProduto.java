package Produto;

public class testaProduto{

    public static void main(String args[]){

        Produto obj1 = new Produto(123, 120, 50, " Mascara ");
        obj1.comprar(10);
        obj1.subir(0.3f);
        System.out.println(obj1.mostra());
        //obj1.setPreco(-20); // encapsulado escondido
        System.out.println("Preco de obj1:" + obj1.getPreco());

        Produto obj2 = new Produto(12, 100, 100," Álcool em gel ");
        obj2.vender(10);
        obj2.descer(0.3f);
        System.out.println(obj2.mostra());
        //obj2.setQtde(-20);// encapsulado escondido
        System.out.println("Qtde de obj2:" + obj2.getQtde());


        Produto obj3 = new Produto(100, 132, 59, "Chocolate");

        System.out.println("Valores de obj3" + obj3.mostra());

}
}
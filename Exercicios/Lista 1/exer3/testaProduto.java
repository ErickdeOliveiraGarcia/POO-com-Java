public class testaProduto{

    public static void main(String args[]){

        Produto obj1 = new Produto(123, 30, 3, " Mascara ");
        obj1.comprar(10);
        obj1.subir(0.3f);
        System.out.println(obj1.mostra());


        Produto obj2 = new Produto(012, 15, 3," Álcool em gel ");
        obj2.vender(10);
        obj2.descer(0.3f);
        System.out.println(obj2.mostra());
    }
}

/*public class testaProduto {
    
    public static void main(String args[]){
        Produto obj1 = new Produto(01,950,450,450,2,2);
        obj1.comprar(0);
        obj1.subir(20);
        System.out.println(obj1.mostrar());

        obj1.vender(50);
        System.out.println(obj1.mostrar());

        Produto obj3 = new Produto();
        obj3.id = 1;
        obj3.qtde = 10;
        obj3.preco = 199;
        obj3.vender = 200;
        obj3.comprar = 50;
        obj3.subir = 10;
        obj3.descer = 10;

       
        obj3.descer(50);
        obj3.comprar(1000);
        System.out.println(obj3.mostrar());

    }

}

*/
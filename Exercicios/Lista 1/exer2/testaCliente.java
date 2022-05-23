public class testaCliente{
    
    public static void main(String args[]){
        Cliente obj1 = new Cliente(53, 29960, "Erick Garcia", 5447);
        obj1.deposito(500);
        System.out.println(obj1.mostrar());


        Cliente obj2 = new Cliente(306, 4565, "Erick Garcia", 5447);
        obj2.realizarSaque(3000);
        System.out.println(obj2.mostrar());

        Cliente obj3 = new Cliente();
        obj3.nome = "Erick";
        obj3.conta = 60;
        obj3.agencia = 30;
        obj3.saldo = 5000;

        obj3.deposito(10000);
        obj3.realizarSaque(500);
        System.out.println(obj3.mostrar());
    }
}

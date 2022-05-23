public class TestaCliente{
    
    public static void main(String args[]){
        Cliente obj1 =  new Cliente("123456-7", "1234-6"," Erick o Garcia", 100);
        /*
        obj1.setnumeroAgencia("1542-3");
        obj1.setnumeroConta("125457-9");
        obj1.setnome("ericksasdffsadf");
        obj1.setsaldo(120);
        */
        obj1.realizarDeposito(500);
        obj1.realizarSaque(800);
        System.out.println(obj1.mostra());


        Cliente obj2 =  new Cliente("123456-5", "1234-5"," Ronaldo fail", 100);

          
        obj2.setnumeroAgencia("1542-3");
        obj2.setnumeroConta("125457-9");
        obj2.setnome("ericksasdffsadf");
        obj2.setsaldo(120);
        

        //obj2.realizarSaque(50);
        System.out.println(obj2.mostra());


    }
}

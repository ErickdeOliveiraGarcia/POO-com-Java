import java.util.Date;
public class Testa {
    
    public static void main(String args[]){
        Cliente c1 = new Cliente("Erick",445755178,"Dinheiro",123);

        Fornecedor f1 = new Fornecedor("Arroz", 25);

        Supermercado sp1 = new Supermercado(c1,f1);

        System.out.println(sp1.toString());
    }
}

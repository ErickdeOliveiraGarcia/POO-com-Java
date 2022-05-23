        //import jdk.nashorn.internal.ir.FunctionNode;

public class Testa {
    public static void exemploPolimorfismo(Funcionario camaleao){
    System.out.println(camaleao.toString());
    }
    
    public static void main(String args[]){

        //Funcionario func1 = new Funcionario();

        Assistente as1 = new Assistente("Fulano", "123", 1000, 4);
        System.out.println(as1.toString());
        as1.receberSalario();
        exemploPolimorfismo(as1);

        Gerente ge1 = new Gerente("Beltrano", "456", 2000, 500);
        System.out.println(ge1.toString());
        ge1.receberSalario();
        exemploPolimorfismo(ge1);

        Diretor di1 = new Diretor("Ciclano", "789", 3000, "Compass");
        System.out.println(di1.toString());
        di1.receberSalario();
        exemploPolimorfismo(di1);

    }

}
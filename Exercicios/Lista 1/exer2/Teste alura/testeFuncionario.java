public class testeFuncionario{

    
    public static void main(String args[]){

        Funcionario f1 = new Funcionario();

        f1.inserir(100," Erick G ", 5447);
        System.out.println(f1.exibir());

        Funcionario f2 = new Funcionario();
         
        f2.inserir(1001," Derick ",2000);
        System.out.println(f2.exibir());

    }

}
    

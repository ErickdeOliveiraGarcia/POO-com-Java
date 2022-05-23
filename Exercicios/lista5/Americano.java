package lista5;
public class Americano implements IEleitor{
    
    @Override
    public void tirarTitulo(){
        System.out.println("Americano tirando título de eleitor");
    }

    @Override
    public void votar(){
        System.out.println("Americano votando");
    }
}

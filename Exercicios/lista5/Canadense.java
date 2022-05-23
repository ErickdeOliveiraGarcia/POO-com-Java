public class Canadense implements iEleitor {
    
    @Override
    public void tirarTitulo(){
        System.out.print("Canadense tirando titulo de eleitor");

    }

    @Override
    public void votar(){
        System.out.println("Canadense votando");
    }
}

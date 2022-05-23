package exemplosPraticos;

public class Teste {
    public static void testePolimorfismo(Moradia camaleao){
        System.out.println(camaleao.toString());
        camaleao.CalcularPreco();
    }

    public static void main(String args[]){
//(String endereco, String cidade, float tamanho, float tamQuintal, boolean piscina){

        Casa c1 = new Casa("Alberto M","Franca",20,1,false);
        testePolimorfismo(c1);
        //System.out.println(c1.toString());
        //c1.CalcularPreco();
        //testePolimorfismo(c1);

//(String endereco, String cidade, float tamanho, int nro, int andar) {

        Apto ap1 = new Apto("Antonio M","Franca",30,10,30);
        //System.out.println(ap1.toString());
        testePolimorfismo(ap1);
        //testePolimorfismo(ap1);
    }
}

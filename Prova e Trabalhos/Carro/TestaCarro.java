public class TestaCarro{
    
    public static void main(String args[]){
        Carro obj1 = new Carro();
        obj1.ano = 2019;
        obj1.modelo = "Onix";
        obj1.motor = true;
        obj1.velocidade = 40;

        Carro obj2 = new Carro(2016,"Celta",true,80);
 

        obj1.mostra();
        obj2.mostra();

        obj1.desligar();
        obj2.desligar();

        obj1.acelerar(40);
        obj2.acelerar(50);

        System.out.println("Obj1 ano:" + this.ano + "modelo" + obj1.modelo +
         "motor:" + obj1.motor + "velocidade" + obj1.velocidade);
        System.out.println("obj2 ano:" + obj2.ano + "modelo" + obj2.modelo +
        "motor:" + obj2.motor + "velocidade" + obj2.velocidade);
    }
}
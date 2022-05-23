public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido; // true -> está poluido, flase -> não esta poluido

    public Rio(){

    }
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
        
    }
    //método que auemnta o b´vel do rio
    public void chover(float x){
        this.nivel = this.nivel + x;
    }

    public void ensolarar(float x){
        this.nivel = this.nivel -x;
    }

    public void sujar(){
    this.poluido = true;
}
public void limpar(){
    this.poluido = false;
}
    public String mostrar(){
        return String.format("Nome do rio: %s Nível do rio %f e se está poluido $b", this.nome, this.nivel,
         this.poluido);
    }
}
/*•	chover(float): que aumenta o nível atual do rio;
•	ensolarar(float): que diminui o nível atual do rio;
•	limpar(): que limpa o rio;
•	sujar(): que polui o rio;
•	mostra(): que mostra todas as informações do rio.

Finalmente, cria uma classe TestaRio, que cria dois Rios (cada um deve utilizar um construtor diferente) e teste os métodos criados.
*/
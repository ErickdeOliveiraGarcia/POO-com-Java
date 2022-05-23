public class Produto{
    public int id, qtde;
    public float preco;
    public String descricao;

    public Produto(){

    }
    public Produto(int id, int qtde, float preco, String descricao){
        this.id = id;
        this.qtde = qtde;
        this.preco = preco;
        this.descricao = descricao;
    }

    public void comprar( int x){
        this.qtde +=x;
    }

    public void vender(int x){
        this.qtde -=x;
    }

    public void subir(float x){
        this.preco +=x;
    }

    public void descer(float x){
        this.preco -=x;
    }
    public String mostra(){
        return " id: "+ this.id + " Descricao " + this.descricao + " Qtde: " + this.qtde + " Preco "
         + this.preco;
    }
}
/*public class Produto {
    int id;
    int qtde;
    float preco;
    int comprar;
    int vender;
    float subir;
    float descer;
 public Produto(){}


public Produto(int id, int qtde, int comprar, int vender, float subir, float descer){
   this.comprar = comprar;
   this.vender = vender;
   this.subir = subir;
   this.descer = descer;
   this.qtde = qtde;
   this.id = id;
}  
public void comprar(int x){
    this.comprar += this.comprar + x;
    this.qtde += this.comprar;
}

public void vender(int x){
    this.vender = this.vender - x;
    this.qtde = this.vender;
}

public void subir(float x){
    this.subir = this.subir + x;
    this.preco = this.subir;
}

public void descer(float x){
    this.descer = this.descer - x;
    this.preco = this.descer;
}

public String mostrar(){
    return String.format("O produto "+ this.id +" em qtde: "+ this.qtde +" e esta com preço: "+ this.preco);

}
}

/*
Implemente em Java uma classe chamada Produto contendo as variáveis id (int), descrição (String), qtde (int) e preco (float). Essa classe deve possuir os dois métodos construtores, com e sem parâmetros, e ainda os métodos:
•	comprar(int x): que compra um produto aumentando em x a quantidade em estoque;
•	vender(int x): que vende um produto diminuindo em x a quantidade em estoque;
•	subir(float x): que aumenta o preço do produto em x unidades;
•	descer(float x): que diminui o preço do produto em x unidades;
•	mostra(): que mostra todas as informações do produto
*/
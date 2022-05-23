package Questao3;
/*/*a) A classe Veiculo (abstrata)

b) A classe Motorizado

c) A classe NãoMotorizado

d) Um exemplo de polimorfismo*/*/ 
public class Motorizado extends Veiculo{
	private float potencia;
	private String combustivel;
	
	public Motorizado(int ano,float preco,String descricao,float potencia,String combustivel) {
		super(ano,preco,descricao);
		this.setCombustivel(combustivel);
		this.setPotencia(potencia);
	}

	public float getPotencia(){
		return potencia;
	}

	public void setPotencia(float potencia){
		this.potencia = potencia;
	}

	public String getCombustivel(){
		return combustivel;
	}

	public void setCombustivel(String combustivel){
		this.combustivel = combustivel;
	}
}
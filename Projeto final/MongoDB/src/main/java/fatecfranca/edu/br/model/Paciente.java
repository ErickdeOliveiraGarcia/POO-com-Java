package fatecfranca.edu.br.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//vamos decorar a classe com @Document
//MongoDB é orientado a documentos do tipo JSON
//a classe Paciente está relacionada ao documento do MongoDB

@Document(collection = "paciente")
public class Paciente {
	
	@Id // id único do MongoDB  -> criado automaticamente no bando de dados
	private String id;
	private String nome;
	private float cpf;
	private float peso;
	private String altura;
	private int idade;
	public Paciente() {
		super();
	}
	public Paciente(String id, String nome, float cpf, float peso, String altura, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getCpf() {
		return cpf;
	}
	public void setCpf(float cpf) {
		this.cpf = cpf;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", peso=" + peso + ", altura=" + altura
				+ ", idade=" + idade + "]";
	}
	

}

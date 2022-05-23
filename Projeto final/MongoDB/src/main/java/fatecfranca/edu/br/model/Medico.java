package fatecfranca.edu.br.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//Mongodb 
@Document(collection = "medico")
public class Medico {
	@Id 
	private String id;
	private String nome;
	private int crm;
	private String especialidade;
	
	public Medico() {
		super();
	}

	
	public Medico(String id, String nome, int crm, String especialidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.crm = crm;
		this.especialidade = especialidade;
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
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	@Override
	public String toString() {
		return "Medico [id=" + id + ", nome=" + nome + ", crm=" + crm + ", especialidade=" + especialidade + "]";
	}

	
}

	package fatecfranca.edu.br.model;
	import javax.persistence.Entity;

	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;



	import lombok.Data;

	@Entity
	@Table(name="medico")
	@Data // getters(), setters() e toString()
	public class Medico {

		@Id // chave primária
		@GeneratedValue(strategy=GenerationType.IDENTITY) // conteúdo gerado automaticamente
		private Long id;
		
		private String nome;
		private int crm;
		private String especialidade;
		
		public Medico() {
			super();
		}
		public Medico(Long id, String nome, int crm, String especialidade) {
			super();
			this.id = id;
			this.nome = nome;
			this.crm = crm;
			this.especialidade = especialidade;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
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



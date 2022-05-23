package fatecfranca.edu.br.model.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fatecfranca.edu.br.model.Medico;

public interface MedicoRepository extends MongoRepository<Medico,String>{

	//teremos uma interface com todos métodos no banco para lidar com Medico
	//Insere, remover, consultar, atualizar
}

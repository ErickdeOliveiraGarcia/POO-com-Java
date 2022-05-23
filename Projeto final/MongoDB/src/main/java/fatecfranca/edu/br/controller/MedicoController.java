package fatecfranca.edu.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatecfranca.edu.br.model.Medico;
import fatecfranca.edu.br.model.repositories.MedicoRepository;
/*
@RestController é para marcar que o controlador está fornecendo serviços REST com o tipo de resposta JSON. 
para agrupar as anotações @Controller e @ResponseBody. @RestController é composição de @Controller e 
@ResponseBody , se não estamos usando a @ResponseBody assinatura no método, precisamos usar o @Restcontroller
*/

@RestController // classe fica responsavel por responder as requisições REST
@RequestMapping("/medico")
public class MedicoController {

	@Autowired //Fornece controle 
	MedicoRepository injecao; // injeção de dependência -> executar métodos por um objeto sem instanciá-lo
	
	@GetMapping
	public List<Medico> get(){
		return injecao.findAll();
	}
	@PostMapping
	public String add(@RequestBody Medico medico) {
	injecao.save(medico);
	return "Medico salvo com sucesso";
	}
	@DeleteMapping("/{id}")
	public String remove(@PathVariable String id) {
		injecao.deleteById(id);
		return "Medico deletado com sucesso";
	}
	
	@PutMapping
	public String update(@RequestBody Medico medico) { //médico tem id
		injecao.save(medico);
		return "Atualização realizada com sucesso";
	}
}

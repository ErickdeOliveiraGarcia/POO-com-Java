package fatecfranca.edu.br.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {

	@GetMapping("/saudacao/dia")
	public String enviaSaudacaoDia() {
		return "Bom dia";
	}
	
	@GetMapping("/saudacao/tarde")
	public String enviaSaudacaoTarde() {
		return "Boa tarde";
	}
	@GetMapping("/saudacao/noite")
	public String enviaSaudacaoNoite() {
		return "Boa noite";
	}
	
	
	@GetMapping("/saudacao/{nome}")
	public String enviaSaudacaoNome(@PathVariable String nome) {
		return "Bom dia" + nome;
	}
	//Método post - > inserir
	@PostMapping("/saudacao/{mensagem}")
	public String insereMensagem(@PathVariable String mensagem) {
		return "Mensagem" + mensagem + "inserida com sucesso";
	}
	//Método delete
	@DeleteMapping("/saudacao/{mensagem}")
	public String removerMensagem(@PathVariable String mensagem) {
		return "Mensagem" + mensagem + "inserida com sucesso";
	}
	
	//Método put--> atualizar
	//Método delete
	@PutMapping("/saudacao/{mensagem}")
	public String atualizarMensagem(@PathVariable String mensagem) {
		return "Mensagem" + mensagem + "inserida com sucesso";
	}
}

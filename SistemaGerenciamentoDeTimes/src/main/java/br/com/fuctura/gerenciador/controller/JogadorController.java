package br.com.fuctura.gerenciador.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.fuctura.gerenciador.entidade.Jogador;

@RestController
public class JogadorController {
	
	@RequestMapping(path = "/jogador", method = RequestMethod.GET)
	public List<Jogador> getJogador(){
		var j1 = new Jogador();		
		j1.setNome("Messi");
		j1.setPeso(90.0);
		
		return List.of(j1);
		
	}
	
	@RequestMapping(path = "/contrato", method = RequestMethod.GET)
	public Jogador getJogador2(){
		var j1 = new Jogador();		
		j1.setNome("CR7");
		j1.setPeso(95.0);
		
		return j1;
	}
	
	@RequestMapping(path = "/jogador", method = RequestMethod.POST)
	public void salvar(@RequestBody Jogador jogador) {
		System.out.println(jogador.toString());
		
	}
	
	@RequestMapping(path = "/jogador/{codigo}", method = RequestMethod.DELETE)
	public void excluir(@PathVariable("codigo") int cod) {
		System.out.println(cod);
		
	}
}

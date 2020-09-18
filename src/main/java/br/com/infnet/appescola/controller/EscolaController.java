package br.com.infnet.appescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.appescola.model.negocio.Escola;
import br.com.infnet.appescola.model.service.EscolaService;

@RestController
@RequestMapping("/api/escola")
public class EscolaController {

	@Autowired private EscolaService service;
	
	@GetMapping
	public List<Escola> obterLista(){		
		return service.obterLista();
	}
	
//	@PostMapping(value = "/{nome}")
//	public void incluir(
//				@PathVariable String nome
//			) {
//		this.incluir(new Escola(nome));
//	}
	
	@PostMapping
	public void incluir(
				@RequestBody Escola escola
			) {
		service.incluir(escola);
	}
	
	@GetMapping(value = "/obter")
	public Escola obterPorId(
				@RequestParam Integer id
			) {
		return service.obterPorId(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public void excluir(
				@PathVariable Integer id
			) {
		service.excluir(id);
	}
}
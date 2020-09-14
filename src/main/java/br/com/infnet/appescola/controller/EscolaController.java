package br.com.infnet.appescola.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.appescola.model.negocio.Escola;

@RestController
@RequestMapping("/api/escola")
public class EscolaController {

	private static Map<Integer, Escola> mapaEscola = new HashMap<Integer, Escola>();
	private static Integer key = 0;
	
	@GetMapping
	public List<Escola> obterLista(){		
		return new ArrayList<Escola>(mapaEscola.values());
	}
	
	@PostMapping(value = "/{nome}")
	public void incluir(
				@PathVariable String nome
			) {
		this.incluir(new Escola(nome));
	}
	
	@PostMapping
	public void incluir(
				@RequestBody Escola escola
			) {
		key++; 
		escola.setId(key); 
		mapaEscola.put(key, escola);
	}
	
	@GetMapping(value = "/obter")
	public Escola obterPorId(
				@RequestParam Integer id
			) {
		return mapaEscola.get(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public void excluir(
				@PathVariable Integer id
			) {
		mapaEscola.remove(id);
	}
}
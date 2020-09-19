package br.com.infnet.appescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.appescola.model.negocio.Escola;
import br.com.infnet.appescola.model.service.EscolaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/escola")
public class EscolaController {

	@Autowired private EscolaService service;

	@ApiOperation(value = "Retornar uma lista de escolas")
	@GetMapping
	public List<Escola> obterLista(){		
		return service.obterLista();
	}

	@RequestMapping(		
			value = "",
			method = RequestMethod.POST,
			produces = {"application/json", "application/xml"}
			)	
	@ApiOperation(value = "Cadastrar uma escola")
	public void incluir(
				@RequestBody Escola escola
			) {
		service.incluir(escola);
	}
	
	@ApiResponses(value = {		
			@ApiResponse(code = 200, message = "Escola retornada com sucesso"),
			@ApiResponse(code = 400, message = "Erro na chamada da API"),
			@ApiResponse(code = 500, message = "Erro no processamento da chamada")
	})			
	@ApiOperation(value = "Obter uma escola pela chave-primária")
	@GetMapping(value = "/obter")
	public Escola obterPorId(
				@RequestParam Integer id
			) {
		return service.obterPorId(id);
	}
	
	@ApiOperation(value = "Excluir uma escola")
	@DeleteMapping(value = "/{id}")
	public void excluir(
				@PathVariable Integer id
			) {
		service.excluir(id);
	}
}
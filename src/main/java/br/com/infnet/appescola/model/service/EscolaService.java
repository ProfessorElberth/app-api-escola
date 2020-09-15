package br.com.infnet.appescola.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appescola.model.negocio.Escola;
import br.com.infnet.appescola.model.repository.IEscolaRepository;

@Service
public class EscolaService {

	@Autowired private IEscolaRepository repository;
	
	public Escola obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	public List<Escola> obterLista(){
		return (List<Escola>)repository.findAll();
	}
	
	public void incluir(Escola escola) {
		repository.save(escola);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}

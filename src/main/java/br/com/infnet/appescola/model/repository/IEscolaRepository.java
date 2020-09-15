package br.com.infnet.appescola.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.appescola.model.negocio.Escola;

@Repository
public interface IEscolaRepository extends CrudRepository<Escola, Integer> {

}

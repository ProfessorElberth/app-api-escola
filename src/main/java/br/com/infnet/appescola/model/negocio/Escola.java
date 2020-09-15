package br.com.infnet.appescola.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEscola")
public class Escola {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;

	public Escola() {
	}
	
	public Escola(String nome) {
		this();
		this.setNome(nome);
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s", this.getId(), this.getNome());
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

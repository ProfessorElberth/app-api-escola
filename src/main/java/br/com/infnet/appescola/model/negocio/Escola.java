package br.com.infnet.appescola.model.negocio;

public class Escola {

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

package br.com.infnet.appescola.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "TPublica")
@PrimaryKeyJoinColumn(name = "idescola")
public class Publica extends Escola {

	@ApiModelProperty(value = "A unidade da federação da escola pública")
	private String uf;

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}
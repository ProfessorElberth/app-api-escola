package br.com.infnet.appescola.testes;

import br.com.infnet.appescola.controller.EscolaController;

public class EscolaTeste {

	public static void main(String[] args) {
		
		EscolaController controle = new EscolaController();
		
		System.out.println(controle.obterLista());
		
//		controle.incluir("infnet");
		
//		System.out.println(controle.obterPorId(1));
		
//		controle.incluir(new Escola("Instituto Infnet"));

//		controle.excluir(2);
		
//		controle.incluir(new Escola("Instituto"));
		
		System.out.println(controle.obterLista());
	}
}
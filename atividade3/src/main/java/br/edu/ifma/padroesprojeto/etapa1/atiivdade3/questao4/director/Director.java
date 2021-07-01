package br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao4.director;

import br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao4.builder.Builder;

public class Director {
	
	public void constructorContato(Builder builder) {
		
		builder.setNome("Nadson Barros");
		builder.setEndereco("Rua 25, 53, Cohatrac");
		builder.setTelefone(98);
		builder.setEmail("nadsonbarros@acad.ifma.edu.br");
	}
}

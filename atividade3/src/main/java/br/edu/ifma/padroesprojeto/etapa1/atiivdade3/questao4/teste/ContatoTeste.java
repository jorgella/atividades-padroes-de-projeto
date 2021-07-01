package br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao4.teste;

import br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao4.builder.ContatoBuilder;
import br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao4.director.Director;
import br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao4.modelo.Pessoa;

public class ContatoTeste {

	public static void main(String[] args) {
		Director director = new Director();
		
		ContatoBuilder builder = new ContatoBuilder();
		director.constructorContato(builder);
		
		Pessoa contato = builder.getResult();
	}
}

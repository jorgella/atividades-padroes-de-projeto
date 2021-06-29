package ifma.dcomp.padroes.contato.teste;

import ifma.dcomp.padroes.contato.builder.ContatoBuilder;
import ifma.dcomp.padroes.contato.director.Director;
import ifma.dcomp.padroes.contato.modelo.Pessoa;


public class ContatoTeste {

	public static void main(String[] args) {
		Director director = new Director();
		
		ContatoBuilder builder = new ContatoBuilder();
		director.constructorContato(builder);
		
		Pessoa contato = builder.getResult();
	}
}

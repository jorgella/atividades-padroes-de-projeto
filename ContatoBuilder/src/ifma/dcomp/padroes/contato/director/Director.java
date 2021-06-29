package ifma.dcomp.padroes.contato.director;

import ifma.dcomp.padroes.contato.builder.Builder;

public class Director {
	
	public void constructorContato(Builder builder) {
		
		builder.setNome("Nadson Barros");
		builder.setEndereco("Rua 25, 53, Cohatrac");
		builder.setTelefone(98);
		builder.setEmail("nadsonbarros@acad.ifma.edu.br");
	}
}

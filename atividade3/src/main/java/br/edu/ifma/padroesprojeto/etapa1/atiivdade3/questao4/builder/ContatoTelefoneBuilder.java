package br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao4.builder;

public class ContatoTelefoneBuilder implements Builder {

	private String nome;
	
	private long telefone;

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}
	
	
}

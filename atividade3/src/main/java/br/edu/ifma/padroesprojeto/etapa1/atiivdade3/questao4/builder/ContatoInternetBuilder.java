package br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao4.builder;

public class ContatoInternetBuilder implements Builder {
	
	private String nome;
	
	private String endereco;

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public void setTelefone(long telefone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}

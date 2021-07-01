package br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao4.builder;

import br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao4.modelo.Pessoa;

public class ContatoBuilder implements Builder {
	
	private String nome;
	private String endereco;
	private long telefone;
	private String email;
	
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
		this.telefone = telefone;
	}
	
	@Override
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Pessoa getResult() {
		return new Pessoa(nome, endereco, telefone, email);
	}
	

}

package ifma.dcomp.padroes.contato.modelo;

public class Pessoa {

	private final String nome;
	private final String endereco;
	private final long telefone;
	private final String email;
	
	
	public Pessoa(String nome, String endereco, long telefone, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public long getTelefone() {
		return telefone;
	}


	public String getEmail() {
		return email;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
}

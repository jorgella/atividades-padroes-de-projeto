package ifma.dcomp.padroes.contato.builder;

public interface Builder {

	void setNome(String nome);
	void setEndereco(String endereco);
	void setTelefone(long telefone);
	void setEmail(String email);
}

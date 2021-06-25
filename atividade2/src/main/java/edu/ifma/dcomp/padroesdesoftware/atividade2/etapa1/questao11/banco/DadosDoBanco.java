package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco;

public class DadosDoBanco {

    private final String nome;
    private final String endereco;
    private final String telefone;
    private final String email;

    public DadosDoBanco(String nome, String endereco, String telefone, String email) {
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

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

}

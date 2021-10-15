package br.edu.ifma.padroessoftware.etapa3.atv1.questao6;

public class Requisicao extends Documento {

    public Requisicao(Long id, String titulo, String descricao, Formatacao formatacao) {
        super(id, titulo, descricao, formatacao);
    }

    @Override
    public String formatar() {
        return formatacao.formatar(this);
    }

}

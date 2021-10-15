package br.edu.ifma.padroessoftware.etapa3.atv1.questao6;

public class Comprovante extends Documento {

    public Comprovante(Long id, String titulo, String descricao, Formatacao formatacao) {
        super(id, titulo, descricao, formatacao);
    }

    @Override
    public String formatar() {
        return formatacao.formatar(this);
    }

}

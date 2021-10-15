package br.edu.ifma.padroessoftware.etapa3.atv1.questao6;

public class FormatacaoPadrao implements Formatacao {
    @Override
    public String formatar(Documento documento) {
        return String.format("[%d - %s: %s]", documento.getId(), documento.getTitulo(), documento.getDescricao());
    }
}

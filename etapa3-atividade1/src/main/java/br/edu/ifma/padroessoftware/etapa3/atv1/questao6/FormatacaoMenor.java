package br.edu.ifma.padroessoftware.etapa3.atv1.questao6;

public class FormatacaoMenor implements Formatacao {

    @Override
    public String formatar(Documento documento) {
        return documento.getTitulo();
    }

}

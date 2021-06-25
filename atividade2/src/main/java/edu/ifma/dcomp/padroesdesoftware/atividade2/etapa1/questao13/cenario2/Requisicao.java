package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2;

public class Requisicao {

    private final Formato formato;
    private final Integer index;

    public Requisicao(Formato formato, Integer index) {
        this.formato = formato;
        this.index = index;
    }

    public Formato getFormato() {
        return formato;
    }

    public Integer getIndex() {
        return index;
    }

}

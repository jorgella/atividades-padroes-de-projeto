package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.calculoorcamento;

import java.math.BigDecimal;

public class Orcamento {

    private final BigDecimal valor;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public Orcamento(Double valor) {
        this.valor = BigDecimal.valueOf(valor);
    }

    public BigDecimal getValor() {
        return valor;
    }

}

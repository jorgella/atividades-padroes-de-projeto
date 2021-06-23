package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.imposto;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.calculoorcamento.Orcamento;

import java.math.BigDecimal;

public class Icms implements Imposto {

    private static final BigDecimal ALIQUOTA_ICMS = new BigDecimal("0.25");

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(ALIQUOTA_ICMS);
    }

}

package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.imposto;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.calculoorcamento.Orcamento;

import java.math.BigDecimal;

public class Iss implements Imposto {

    private static final BigDecimal ALIQUOTA_ISS = new BigDecimal("0.06");

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(ALIQUOTA_ISS);
    }

}

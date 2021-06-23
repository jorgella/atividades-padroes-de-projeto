package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.imposto;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.calculoorcamento.Orcamento;

import java.math.BigDecimal;

public class ImpostoCondicional implements Imposto {

    private static final BigDecimal LIMITE_MIL = new BigDecimal("1000.00");
    private static final BigDecimal LIMITE_TRES_MIL = new BigDecimal("3000.00");
    private static final BigDecimal ALIQOTA_MINIMA_CINCO_POR_CENTO = new BigDecimal("0.05");
    private static final BigDecimal ALIQUOTA_SETE_POR_CENTO = new BigDecimal("0.07");
    private static final BigDecimal ALIQUOTA_OITO_POR_CENTO = new BigDecimal("0.08");
    private static final BigDecimal ACRESCIMO_TRINTA = new BigDecimal("30.00");


    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal aliquota;
        BigDecimal acrescimo = BigDecimal.ZERO;

        if (orcamento.getValor().setScale(2).compareTo(LIMITE_MIL) < 0) {
            aliquota = ALIQOTA_MINIMA_CINCO_POR_CENTO;
        } else if (orcamento.getValor().setScale(2).compareTo(LIMITE_TRES_MIL) <= 0) {
            aliquota = ALIQUOTA_SETE_POR_CENTO;
        } else {
            aliquota = ALIQUOTA_OITO_POR_CENTO;
            acrescimo = ACRESCIMO_TRINTA;
        }

        return acrescimo.add(orcamento.getValor().multiply(aliquota));
    }

}

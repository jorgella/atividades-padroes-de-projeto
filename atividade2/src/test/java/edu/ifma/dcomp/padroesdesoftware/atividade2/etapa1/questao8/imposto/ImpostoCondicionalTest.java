package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.imposto;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.calculoorcamento.Orcamento;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.hamcrest.MatcherAssert.assertThat;

class ImpostoCondicionalTest {

    @Test
    void deveCalcularImpostoCondicionalDeCincoPorCentoParaValorAbaixoDeMil() {
        Imposto imposto = new ImpostoCondicional();

        Orcamento orcamento = new Orcamento(new BigDecimal("999.99"));

        BigDecimal valorImposto = imposto.calcular(orcamento);

        assertThat(valorImposto.setScale(2, RoundingMode.FLOOR), CoreMatchers.is(CoreMatchers.equalTo(new BigDecimal("49.99"))));
    }

    @Test
    void deveCalcularImpostoCondicionalDeSetePorCentoParaValorEntreMilETresMil() {
        Imposto imposto = new ImpostoCondicional();

        {
            Orcamento orcamentoMil = new Orcamento(new BigDecimal("1000.00"));

            BigDecimal valorImpostoMil = imposto.calcular(orcamentoMil);

            assertThat(valorImpostoMil.setScale(2, RoundingMode.FLOOR), CoreMatchers.is(CoreMatchers.equalTo(new BigDecimal("70.00"))));
        }

        {
            Orcamento orcamentoTresMil = new Orcamento(new BigDecimal("3000.00"));

            BigDecimal valorImpostoTesMil = imposto.calcular(orcamentoTresMil);

            assertThat(valorImpostoTesMil.setScale(2, RoundingMode.FLOOR), CoreMatchers.is(CoreMatchers.equalTo(new BigDecimal("210.00"))));
        }
    }

    @Test
    void deveCalcularImpostoCondicionalDeOitoPorCentoMaisTrintaParaValorAcimaDeTresMil() {
        Imposto imposto = new ImpostoCondicional();

        Orcamento orcamento = new Orcamento(new BigDecimal("3000.01"));

        BigDecimal valorImposto = imposto.calcular(orcamento);

        assertThat(valorImposto.setScale(5, RoundingMode.FLOOR), CoreMatchers.is(CoreMatchers.equalTo(new BigDecimal("270.00080"))));
    }

}
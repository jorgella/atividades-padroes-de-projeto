package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.imposto;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.calculoorcamento.Orcamento;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.imposto.Imposto;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.imposto.Iss;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class IssTest {

    @Test
    void deveCalcularIss() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100.00"));

        Imposto iss = new Iss();
        BigDecimal valorIss = iss.calcular(orcamento);

        assertThat(valorIss.setScale(2, RoundingMode.UNNECESSARY), is(equalTo(new BigDecimal("6.00"))));
    }

}
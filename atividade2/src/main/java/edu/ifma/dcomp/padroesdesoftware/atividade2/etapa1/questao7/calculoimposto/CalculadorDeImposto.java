package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.calculoimposto;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.calculoorcamento.Orcamento;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.imposto.Imposto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadorDeImposto {

    public BigDecimal calculaValorImposto(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }

    public void imprimeValorImposto(Orcamento orcamento, Imposto imposto) {
        var nomeImposto = imposto.getClass().getSimpleName();
        var valorImposto = this.calculaValorImposto(orcamento, imposto);
        var mensagem = String.format("%s com valor %s", nomeImposto, valorImposto.setScale(2, RoundingMode.HALF_UP));
        System.out.println(mensagem);
    }

}

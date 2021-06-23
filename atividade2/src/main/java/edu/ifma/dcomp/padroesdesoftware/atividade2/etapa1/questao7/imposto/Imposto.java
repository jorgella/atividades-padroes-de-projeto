package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.imposto;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.calculoorcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}

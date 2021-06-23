package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.imposto;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.calculoorcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}

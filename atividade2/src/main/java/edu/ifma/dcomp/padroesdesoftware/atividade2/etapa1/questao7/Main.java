package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.calculoimposto.CalculadorDeImposto;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.calculoorcamento.Orcamento;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.imposto.Icms;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.imposto.Imposto;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao7.imposto.Iss;

public class Main {

    public static void main(String... args) {
        var calculador = new CalculadorDeImposto();

        // Novo orçamento
        var orcamento = new Orcamento(1_000.00);


        Imposto iss = new Iss();
        System.out.println("Calculando o valor do Iss ...");
        calculador.imprimeValorImposto(orcamento, iss);

        Imposto icms = new Icms();
        System.out.println("Calculando o valor do Icms ...");
        calculador.imprimeValorImposto(orcamento, icms);
    }

}

package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.calculoimposto.CalculadorDeImposto;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.calculoorcamento.Orcamento;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.imposto.Icms;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.imposto.Imposto;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.imposto.ImpostoCondicional;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao8.imposto.Iss;

public class Main {

    public static void main(String... args) {
        var calculador = new CalculadorDeImposto();

        var orcamento1 = new Orcamento(100.00);
        var orcamento2 = new Orcamento(1_000.00);
        var orcamento3 = new Orcamento(4_000.00);

        Imposto impostoCondicional = new ImpostoCondicional();
        Imposto iss = new Iss();
        Imposto icms = new Icms();

        System.out.println("Calculando o valor do ImpostoCondicional para orçamento abaixo de 1000 ...");
        calculador.imprimeValorImposto(orcamento1, impostoCondicional);
        System.out.println("Calculando o valor do ImpostoCondicional para orçamento entre de 1000 e 3000 ...");
        calculador.imprimeValorImposto(orcamento2, impostoCondicional);
        System.out.println("Calculando o valor do ImpostoCondicional para orçamento acima de 3000 ...");
        calculador.imprimeValorImposto(orcamento3, impostoCondicional);

        // Vendo se a adição de uma nova implementação de imposto afetou o cálculo dos demaiss
        System.out.println("Calculando o valor do Iss ...");
        calculador.imprimeValorImposto(orcamento2, iss);

        System.out.println("Calculando o valor do Icms ...");
        calculador.imprimeValorImposto(orcamento2, icms);
    }

}

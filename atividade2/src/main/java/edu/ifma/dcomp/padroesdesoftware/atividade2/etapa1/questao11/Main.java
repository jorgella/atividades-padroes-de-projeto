package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco.Conta;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco.DadosDoBanco;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco.Database;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.relatorio.Relatorio;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.relatorio.RelatorioComplexo;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.relatorio.RelatorioSimples;

import java.math.BigDecimal;

public class Main {

    public static void main(String... args) {
        Database database = new Database();
        database.add(new Conta("Jon", 1L, 1234L, new BigDecimal("1234")));
        database.add(new Conta("Joao", 1L, 1235L, new BigDecimal("1000")));
        database.add(new Conta("Joana", 1L, 1236L, new BigDecimal("2000")));
        database.add(new Conta("Ana", 2L, 123L, new BigDecimal("3000")));
        database.add(new Conta("Cris", 2L, 124L, new BigDecimal("5000")));
        database.add(new Conta("Rebecca", 3L, 125L, new BigDecimal("10000")));

        var contas = database.findAll();

        var dadosBanco = new DadosDoBanco("Banco ABCD", "Rua 2", "9", "contato@bancoabcd.com");

        Relatorio relatorioSimples = new RelatorioSimples(dadosBanco);
        Relatorio relatorioComplexo = new RelatorioComplexo(dadosBanco);

        System.err.println("Relatório Simples: ");
        System.out.println(relatorioSimples.criarRelatorio(contas));

        System.out.println();
        System.err.println("-----------------------------");
        System.out.println("\n");
        System.err.println("Relatório Complexo: ");
        System.out.println(relatorioComplexo.criarRelatorio(contas));
    }

}

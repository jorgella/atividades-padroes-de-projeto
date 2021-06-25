package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.relatorio;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco.Conta;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco.DadosDoBanco;

import java.util.List;

public abstract class Relatorio {

    private final DadosDoBanco dadosDoBanco;

    protected Relatorio(DadosDoBanco dadosDoBanco) {
        this.dadosDoBanco = dadosDoBanco;
    }

    protected DadosDoBanco getDadosBanco() {
        return dadosDoBanco;
    }

    public final String criarRelatorio(List<Conta> contas) {
        String relatorio = this.construirCabecalho();
        relatorio += "\n";
        relatorio += this.construirCorpo(contas);
        relatorio += "\n";
        relatorio += this.construirRodape();
        return relatorio;
    }

    abstract String construirCabecalho();

    abstract String construirCorpo(List<Conta> contas);

    abstract String construirRodape();

}

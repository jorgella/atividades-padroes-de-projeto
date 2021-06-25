package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.relatorio;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco.Conta;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco.DadosDoBanco;

import java.util.List;
import java.util.stream.Collectors;

public class RelatorioSimples extends Relatorio {

    public RelatorioSimples(DadosDoBanco dadosDoBanco) {
        super(dadosDoBanco);
    }

    @Override
    String construirCabecalho() {
        return this.getDadosBanco().getNome() + " - " + this.getDadosBanco().getTelefone();
    }

    @Override
    String construirCorpo(List<Conta> contas) {
        return contas.stream()
                     .map(this::getDadosRelatorioSimples)
                     .collect(Collectors.joining("\n"));
    }

    @Override
    String construirRodape() {
        return this.getDadosBanco().getNome() + " - " + this.getDadosBanco().getTelefone();
    }

    private String getDadosRelatorioSimples(Conta conta) {
        return String.format("Titular: %s. Saldo: %s.", conta.getTitular(), conta.getSaldo());
    }

}

package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.relatorio;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco.Conta;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco.DadosDoBanco;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class RelatorioComplexo extends Relatorio {

    public RelatorioComplexo(DadosDoBanco dadosDoBanco) {
        super(dadosDoBanco);
    }

    @Override
    String construirCabecalho() {
        return String.format("%s. Endereço: %s. Telefone: %s.", getDadosBanco().getNome(), getDadosBanco().getEndereco(), getDadosBanco().getTelefone());
    }

    @Override
    String construirCorpo(List<Conta> contas) {
        return contas.stream()
                     .map(this::getDadosRelatorioComplexo)
                     .collect(Collectors.joining("\n"));
    }

    @Override
    String construirRodape() {
        return String.format("Email: %s. %s.", getDadosBanco().getEmail(), LocalDate.now());
    }

    private String getDadosRelatorioComplexo(Conta conta) {
        return String.format("Titular: %s. Ag: %d. Conta %d. Saldo: %s.", conta.getTitular(), conta.getAgencia(), conta.getNumeroConta(), conta.getSaldo());
    }

}

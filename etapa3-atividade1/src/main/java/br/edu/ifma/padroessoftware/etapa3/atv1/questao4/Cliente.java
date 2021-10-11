package br.edu.ifma.padroessoftware.etapa3.atv1.questao4;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt3.Logger;

import java.util.stream.IntStream;

public final class Cliente {

    private final Somador somador;

    public Cliente(Somador somador) {
        this.somador = somador;
    }

    public void executar() {
        int[] vetor = IntStream.range(1, 11).toArray();

        int soma = somador.somaVetor(vetor);
        Logger.LoggerFactory.getActiveLogger().log(String.valueOf(soma));
    }

}

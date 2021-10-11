package br.edu.ifma.padroessoftware.etapa3.atv1.questao4;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao4.defaultimpl.SomadorLista;

import java.util.Arrays;

public class SomadorVetorAdapter implements Somador {

    private final SomadorLista somadorLista = new SomadorLista();

    @Override
    public int somaVetor(int[] vetor) {
        return somadorLista.somaLista(Arrays.stream(vetor).boxed().toList());
    }
}

package br.edu.ifma.padroessoftware.etapa3.atv1.questao4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomadorVetorAdapterTest {

    @Test
    void deveSomarUmVetorDeInteiros() {
        Somador somador = new SomadorVetorAdapter();
        int result = somador.somaVetor(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

}
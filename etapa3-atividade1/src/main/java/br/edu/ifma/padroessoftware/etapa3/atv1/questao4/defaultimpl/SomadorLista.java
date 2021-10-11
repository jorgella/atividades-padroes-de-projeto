package br.edu.ifma.padroessoftware.etapa3.atv1.questao4.defaultimpl;

import java.util.List;

public class SomadorLista {

    public int somaLista(List<Integer> lista) {
        return lista.stream().mapToInt(i -> i).sum();
    }

}

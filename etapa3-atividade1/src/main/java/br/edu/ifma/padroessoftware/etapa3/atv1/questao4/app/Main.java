package br.edu.ifma.padroessoftware.etapa3.atv1.questao4.app;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao4.Cliente;
import br.edu.ifma.padroessoftware.etapa3.atv1.questao4.SomadorVetorAdapter;

public class Main {

    public static void main(String[] args) {
        var somador = new SomadorVetorAdapter();

        new Cliente(somador).executar();
    }

}

package br.edu.ifma.padroessoftware.etapa3.atv1.questao5.app;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao5.*;

public class Main {

    public static void main(String[] args) {
        var experimento1 = new Experimento();

        experimento1.addAction(new ElevacaoTemperaturaCommand());
        experimento1.addAction(new AplicacaoProdutoQuimicoCommand());
        experimento1.addAction(new ChoqueTermicoCommand());

        experimento1.execute();

        var experimento2 = new Experimento();

        experimento2.addAction(new AplicacaoProdutoQuimicoCommand());
        experimento2.addAction(new ChoqueTermicoCommand());

        experimento2.execute();

        var experimento3 = new Experimento();

        experimento3.addAction(new DiminuicaoTemperaturaCommand());
        experimento3.addAction(new AplicacaoProdutoQuimicoCommand());

        experimento3.execute();
    }

}

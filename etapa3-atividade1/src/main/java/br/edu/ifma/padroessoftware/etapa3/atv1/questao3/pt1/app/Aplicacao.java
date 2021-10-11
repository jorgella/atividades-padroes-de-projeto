package br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt1.app;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt1.Logger;

public class Aplicacao {

    public static void main(String[] args) {
        Logger log1 = new Logger();
        log1.ativar();
        log1.log("PRIMEIRA MENSAGEM DE LOG");

        Logger log2 = new Logger();
        log2.log("SEGUNDA MENSAGEM DE LOG");
    }

}

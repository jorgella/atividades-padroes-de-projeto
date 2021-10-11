package br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt3.app;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt3.Logger;

public class Aplicacao {

    public static void main(String[] args) {
        Logger log1 = Logger.LoggerFactory.getLogger();
        log1.ativar();
        log1.log("PRIMEIRA MENSAGEM DE LOG");

        Logger log2 = Logger.LoggerFactory.getLogger();
        log2.log("SEGUNDA MENSAGEM DE LOG");
    }

}

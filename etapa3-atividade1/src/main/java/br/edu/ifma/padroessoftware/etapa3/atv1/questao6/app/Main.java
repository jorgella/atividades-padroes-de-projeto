package br.edu.ifma.padroessoftware.etapa3.atv1.questao6.app;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt3.Logger;
import br.edu.ifma.padroessoftware.etapa3.atv1.questao6.*;

public class Main {

    public static void main(String[] args) {
        Logger log = Logger.LoggerFactory.getActiveLogger();

        Documento requisicao1 = new Requisicao(1L, "Requisição 1", "Descrição da requisição 1.", new FormatacaoPadrao());
        log.log(requisicao1.toString());

        Documento requisicao2 = new Requisicao(2L, "Requisição 2", "Descrição da requisição 1.", new FormatacaoMenor());
        log.log(requisicao2.toString());

        Documento comprovante1 = new Comprovante(3L, "Comprovante 3", "Descricao do comprovante 3.", new FormatacaoPadrao());
        log.log(comprovante1.toString());

        Documento comprovante2 = new Comprovante(4L, "Comprovante 4", "Descricao do comprovante 4.", new FormatacaoMenor());
        log.log(comprovante2.toString());
    }

}

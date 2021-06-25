package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.request;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.Requisicao;

public interface RequestHandler {

    String processar(Requisicao requisicao);

    RequestHandler setNext(RequestHandler next);

    String next(Requisicao requisicao);

}

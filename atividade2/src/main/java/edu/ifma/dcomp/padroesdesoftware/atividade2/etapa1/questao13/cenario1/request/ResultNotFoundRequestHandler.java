package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario1.request;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario1.Requisicao;

public class ResultNotFoundRequestHandler implements RequestHandler {

    public ResultNotFoundRequestHandler() {

    }

    @Override
    public String processar(Requisicao requisicao) {
        switch (requisicao.getFormato()) {
            case CSV:
                return "%";
            case XML:
                return "<conta>\n<conta>";
            case JSON:
                return "{}";
        }

        return "";
    }

}

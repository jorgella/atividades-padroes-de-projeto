package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.request.CsvRequestHandler;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.request.RequestHandler;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.request.JsonRequestHandler;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.request.XmlRequestHandler;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        final var contaRepository = new ContaRepository();
        contaRepository.addConta(new Conta(1234, new BigDecimal("2000")));

        RequestHandler reqjson = new JsonRequestHandler(contaRepository);
        RequestHandler reqXml = new XmlRequestHandler(contaRepository);
        RequestHandler reqCsv = new CsvRequestHandler(contaRepository);

        reqjson.setNext(reqXml).setNext(reqCsv);

        var requisicaoCsv = new Requisicao(Formato.CSV, 0);

        System.out.println("Resposta CSV: " + reqjson.processar(requisicaoCsv));

        var requisicaoXml = new Requisicao(Formato.XML, 0);

        System.out.println("Resposta XML: " + reqjson.processar(requisicaoXml));

        var requisicaoJson = new Requisicao(Formato.JSON, 0);

        System.out.println("Resposta JSON: " + reqjson.processar(requisicaoJson));

        var requisicaoNotFound = new Requisicao(Formato.JSON, 1);

        System.err.println("Resposta Not Found: " + reqjson.processar(requisicaoNotFound));
    }

}

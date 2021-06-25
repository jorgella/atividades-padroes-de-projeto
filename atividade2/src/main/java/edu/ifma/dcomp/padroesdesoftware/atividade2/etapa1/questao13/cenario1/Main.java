package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario1;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario1.request.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        final var contaRepository = new ContaRepository();
        contaRepository.addConta(new Conta(1234, new BigDecimal("2000")));

        RequestHandler reqCsv = new CsvRequestHandler(new ResultNotFoundRequestHandler(), contaRepository);
        RequestHandler reqXml = new XmlRequestHandler(reqCsv, contaRepository);
        RequestHandler reqjson = new JsonRequestHandler(reqXml, contaRepository);

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

package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario1.request;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario1.ChainException;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario1.ContaRepository;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario1.Formato;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario1.Requisicao;

public class XmlRequestHandler implements RequestHandler {

    private RequestHandler nextChain;
    private final ContaRepository contaRepository;

    public XmlRequestHandler(RequestHandler nextChain, ContaRepository contaRepository) {
        this.nextChain = nextChain;
        this.contaRepository = contaRepository;
    }

    @Override
    public String processar(Requisicao requisicao) {
        if (Formato.XML.equals(requisicao.getFormato())) {
            try {
            return this.recuperarResultadoJson(requisicao);

            } catch (ChainException ex) {
                nextChain = new ResultNotFoundRequestHandler();
            }
        }

        return this.nextChain.processar(requisicao);
    }

    private String recuperarResultadoJson(Requisicao requisicao) {
        var conta = contaRepository.findById(requisicao.getIndex()).orElseThrow(() -> new ChainException("Entidade não encontrada"));

        return String.format("<conta>\n\t<numero>%d</numero>\n\t<saldo>%s</saldo>\n</conta>", conta.getNumero(), conta.getSaldo());
    }

}

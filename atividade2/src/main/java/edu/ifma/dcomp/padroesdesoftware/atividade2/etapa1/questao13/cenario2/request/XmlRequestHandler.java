package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.request;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.ContaRepository;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.ChainException;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.Formato;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.Requisicao;

public class XmlRequestHandler implements RequestHandler {

    private RequestHandler nextChain;
    private final ContaRepository contaRepository;

    public XmlRequestHandler(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public String processar(Requisicao requisicao) {
        if (Formato.XML.equals(requisicao.getFormato())) {
            try {
                return this.recuperarResultadoJson(requisicao);
            } catch (ChainException ex) {
                return "<conta>\n<conta>";
            }
        }

        return this.next(requisicao);
    }

    @Override
    public RequestHandler setNext(RequestHandler next) {
        if (next != null) {
            this.nextChain = next;
            return next;
        }
        throw new ChainException("Erro ao fazer o set do proximo após XML");
    }

    @Override
    public String next(Requisicao requisicao) {
        return nextChain.processar(requisicao);
    }

    private String recuperarResultadoJson(Requisicao requisicao) {
        var conta = contaRepository.findById(requisicao.getIndex()).orElseThrow(() -> new ChainException("Entidade não encontrada"));

        return String.format("<conta>\n\t<numero>%d</numero>\n\t<saldo>%s</saldo>\n</conta>", conta.getNumero(), conta.getSaldo());
    }

}

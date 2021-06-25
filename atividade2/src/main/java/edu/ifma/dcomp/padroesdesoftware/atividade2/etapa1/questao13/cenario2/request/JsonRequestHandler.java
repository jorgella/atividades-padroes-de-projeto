package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.request;

import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.ContaRepository;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.Formato;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.Requisicao;
import edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2.ChainException;

public class JsonRequestHandler implements RequestHandler {

    private RequestHandler nextChain;
    private final ContaRepository contaRepository;

    public JsonRequestHandler(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public String processar(Requisicao requisicao) {
        if (Formato.JSON.equals(requisicao.getFormato())) {
            try {
            return this.recuperarResultadoJson(requisicao);

            } catch (ChainException ex) {
                return "{}";
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
        throw new ChainException("Erro ao fazer o set do proximo após JSON");
    }

    @Override
    public String next(Requisicao requisicao) {
        return nextChain.processar(requisicao);
    }

    private String recuperarResultadoJson(Requisicao requisicao) {
        var conta = contaRepository.findById(requisicao.getIndex()).orElseThrow(() -> new ChainException("Entidade não encontrada"));

        return String.format("{\n\t\"numero\": %d,\n\t\"saldo\": %s\n}", conta.getNumero(), conta.getSaldo());
    }

}

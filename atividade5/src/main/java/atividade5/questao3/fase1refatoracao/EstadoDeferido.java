package atividade5.questao3.fase1refatoracao;

import atividade5.questao3.fase0procedural.MudancaDeEstadoNaoMapeadaException;

public class EstadoDeferido extends EstadoAvaliado {

    private static final String MESSAGE = "Processo número %s deferido. não há mudança de tramitação.";

    private final Processo processo;

    public EstadoDeferido(Processo processo) {
        this.processo = processo;
    }

    @Override
    public void validarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException(String.format(MESSAGE, processo.getNumeroProcesso()));
    }

    @Override
    public void cancelarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException(String.format(MESSAGE, processo.getNumeroProcesso()));
    }

    @Override
    public void designarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException(String.format(MESSAGE, processo.getNumeroProcesso()));
    }

    @Override
    public void deferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException(String.format(MESSAGE, processo.getNumeroProcesso()));
    }

    @Override
    public void indeferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException(String.format(MESSAGE, processo.getNumeroProcesso()));
    }

    @Override
    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException(String.format(MESSAGE, processo.getNumeroProcesso()));
    }

}

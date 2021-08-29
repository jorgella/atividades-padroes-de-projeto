package atividade5.questao3.fase1refatoracao;

import atividade5.questao3.fase0procedural.MudancaDeEstadoNaoMapeadaException;

public class EstadoCriado implements EstadoDoProcesso {


    private final Processo processo;

    public EstadoCriado(Processo processo) {
        this.processo = processo;
    }

    @Override
    public void validarProcesso() throws MudancaDeEstadoNaoMapeadaException {

    }

    @Override
    public void cancelarProcesso() throws MudancaDeEstadoNaoMapeadaException {

    }

    @Override
    public void designarProcesso() throws MudancaDeEstadoNaoMapeadaException {

    }

    @Override
    public void deferirProcesso() throws MudancaDeEstadoNaoMapeadaException {

    }

    @Override
    public void indeferirProcesso() throws MudancaDeEstadoNaoMapeadaException {

    }

    @Override
    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {

    }
}
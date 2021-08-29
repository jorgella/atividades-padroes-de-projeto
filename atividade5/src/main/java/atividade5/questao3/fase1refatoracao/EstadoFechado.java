package atividade5.questao3.fase1refatoracao;

import atividade5.questao3.fase0procedural.MudancaDeEstadoNaoMapeadaException;

public class EstadoFechado implements EstadoDoProcesso {
    @Override
    public void validarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.println("Estado antigo: " + this.processo.getEstado());
        this.processo.setEstado(new EstadoCriado(this.processo));
        System.out.println("Novo estado: " + this.processo.getEstado());
    }

    @Override
    public void cancelarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode cancelar processo avaliado");
    }

    @Override
    public void designarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.println("Estado antigo: " + this.estadoDoProcesso);
        this.processo.setEstado(new EstadoCriado) = "FECHADO";
        System.out.println("Novo estado: " + this.estadoDoProcesso);
    }

    @Override
    public void deferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode deferir processo fechado");
    }

    @Override
    public void indeferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode indeferir processo fechado");
    }

    @Override
    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode recorrrer processo fechado");
    }
}

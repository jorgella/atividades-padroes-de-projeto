package atividade5.questao3.fase1refatoracao;

import atividade5.questao3.fase0procedural.MudancaDeEstadoNaoMapeadaException;

public class EstadoEmRecurso implements EstadoDoProcesso {

    private final Processo processo;

    public EstadoEmRecurso(Processo processo) {
        this.processo = processo;
    }

    @Override
    public void validarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não é possível validar enquanto o processo está no estado " + this);
    }

    @Override
    public void cancelarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não é possível cancelar enquanto o processo está no estado " + this);
    }

    @Override
    public void designarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.println("Estado antigo: " + this.processo.getEstado());
        this.processo.setEstado(new EstadoEmAvaliacao(this.processo));
        System.out.println("Novo estado: " + this.processo.getEstado());
    }

    @Override
    public void deferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não é possível deferir enquanto o processo está no estado " + this);
    }

    @Override
    public void indeferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não é possível indeferir enquanto o processo está no estado " + this);
    }

    @Override
    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não é possível recorrer enquanto o processo está no estado " + this);
    }

    @Override
    public String toString() {
        return "EM_RECURSO";
    }

}

package atividade5.questao3.fase1refatoracao;

public class EstadoFechado implements EstadoDoProcesso {

    private static final String MESSAGE = "Processo número %s fechado. não há mudança de tramitação.";

    private final Processo processo;

    public EstadoFechado(Processo processo) {
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

    @Override
    public String toString() {
        return "Fechado".toUpperCase();
    }
}

package atividade5.questao3.fase1refatoracao;

public class EstadoIndeferido extends EstadoAvaliado {

    private final Processo processo;

    public EstadoIndeferido(Processo processo) {
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
        throw new MudancaDeEstadoNaoMapeadaException("Não é possível designar enquanto o processo está no estado " + this);
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
        System.out.printf("Recorrendo processo número %d.\n", this.processo.getNumeroProcesso());
        System.out.println("Estado antigo: " + this.processo.getEstado());
        this.processo.setEstado(new EstadoEmRecurso(this.processo));
        System.out.println("Novo estado: " + this.processo.getEstado());
    }

    @Override
    public String toString() {
        return "INDEFERIDO";
    }

}

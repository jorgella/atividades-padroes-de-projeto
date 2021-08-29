package atividade5.questao3.fase1refatoracao;

public class EstadoEmAvaliacao implements EstadoDoProcesso {

    private Processo processo;

    public EstadoEmAvaliacao(Processo processo) {
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
        System.out.println("Estado antigo: " + this.processo.getEstado());
        this.processo.setEstado(new EstadoDeferido(this.processo));
        System.out.println("Novo estado: " + this.processo.getEstado());
    }

    @Override
    public void indeferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.println("Estado antigo: " + this.processo.getEstado());
        this.processo.setEstado(new EstadoIndeferido(this.processo));
        System.out.println("Novo estado: " + this.processo.getEstado());
    }

    @Override
    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não é possível recorrer enquanto o processo está no estado " + this);
    }

    @Override
    public String toString() {
        return "EM_AVALIACAO";
    }
}

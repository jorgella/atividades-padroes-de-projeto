package atividade5.questao3.fase1refatoracao;

public class EstadoGestacao implements EstadoDoProcesso {

    private final Processo processo;

    public EstadoGestacao(Processo processo) {
        this.processo = processo;
    }


    @Override
    public void validarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.println("Estado antigo: " + this.processo.getEstado());
        this.processo.setEstado(new EstadoCriado(this.processo));
        System.out.println("Novo estado: " + this.processo.getEstado());
    }

    @Override
    public void cancelarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode cancelar processo em gestação");
    }

    @Override
    public void designarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode designar processo em gestação");
    }

    @Override
    public void deferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode deferir processo em gestação");
    }

    @Override
    public void indeferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode indeferir processo em gestação");
    }

    @Override
    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode recorrer processo em gestação");
    }


    @Override
    public String toString() {
        return "Gestacao".toUpperCase();
    }
}

package atividade5.questao3.fase1refatoracao;

public abstract class EstadoAvaliado implements EstadoDoProcesso {

  private final Processo processo;

    public EstadoAvaliado(Processo processo) {
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
         throw new MudancaDeEstadoNaoMapeadaException("Não pode cancelar processo avaliado");
    }

    @Override
    public void designarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode designar processo avaliado");
    }

    @Override
    public void deferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
      System.out.printf("Deferindo processo número %d.\n", this.numeroProcesso);
        if ("EM_AVALIACAO".equals(this.estadoDoProcesso)) {
            System.out.println("Estado antigo: " + this.estadoDoProcesso);
            this.estadoDoProcesso = "DEFERIDO";
            System.out.println("Novo estado: " + this.estadoDoProcesso);
        } else {
            throw new MudancaDeEstadoNaoMapeadaException("Não é possível deferir enquanto o processo está no estado " + this.estadoDoProcesso);
        }
    }

    @Override
    public void indeferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
         System.out.printf("Indeferindo processo número %d.\n", this.numeroProcesso);
        if ("EM_AVALIACAO".equals(this.estadoDoProcesso)) {
            System.out.println("Estado antigo: " + this.estadoDoProcesso);
            this.estadoDoProcesso = "INDEFERIDO";
            System.out.println("Novo estado: " + this.estadoDoProcesso);
        } else {
            throw new MudancaDeEstadoNaoMapeadaException("Não é possível indeferir enquanto o processo está no estado " + this.estadoDoProcesso);
        }
    }

    @Override
    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {
           throw new MudancaDeEstadoNaoMapeadaException("Não pode recorrer processo avaliado");
    }
}

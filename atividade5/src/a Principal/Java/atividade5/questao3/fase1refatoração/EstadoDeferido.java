package atividade5.questao3.fase1refatoracao;

import atividade5.questao3.fase0procedural.MudancaDeEstadoNaoMapeadoException;

public class EstadoDeferido extends EstadoAvaliado{
  
  private final Processo processo;

    public EstadoDeferido(Processo processo) {
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
         throw new MudancaDeEstadoNaoMapeadaException("Não pode cancelar processo com avaliação deferida");
    }

    @Override
    public void designarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        throw new MudancaDeEstadoNaoMapeadaException("Não pode designar processo com avaliação deferida");
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
        throw new MudancaDeEstadoNaoMapeadaException("Não é possível indeferir enquanto o processo está no estado " + this.estadoDoProcesso);
    }

    @Override
    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {
           throw new MudancaDeEstadoNaoMapeadaException("Não pode recorrer processo avaliado");
    }
}
  

}

package atividade5.questao3.fase1refatoracao;

import atividade5.questao3.fase0procedural.MudancaDeEstadoNaoMapeadaException;

public class EstadoCriado implements EstadoDoProcesso {


    private final Processo processo;

    public EstadoCriado(Processo processo) {
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
        throw new MudancaDeEstadoNaoMapeadaException("Não é possível cancelar enquanto o processo está no estado " + this.estadoDoProcesso);
    }

    @Override
    public void designarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.println("Estado antigo: " + this.estadoDoProcesso);
        this.processo.setEstado(new EstadoCriado) = "CRIADO";
        System.out.printf("Enviando email para notificar sobre o processo número %d.\n", this.numeroProcesso);
        this.dataPrazoLegal = LocalDate.now().plusDays(2);
        System.out.println("Novo estado: " + this.estadoDoProcesso);
    }

    @Override
    public void deferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
            throw new MudancaDeEstadoNaoMapeadaException("Não é possível deferir enquanto o processo está no estado " + this.estadoDoProcesso);
    }

    @Override
    public void indeferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
            throw new MudancaDeEstadoNaoMapeadaException("Não é possível indeferir enquanto o processo está no estado " + this.estadoDoProcesso);
    }

    @Override
    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {
           throw new MudancaDeEstadoNaoMapeadaException("Não é possível recorrer enquanto o processo está no estado " + this.estadoDoProcesso);
    }
}

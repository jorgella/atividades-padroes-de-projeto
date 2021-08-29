package atividade5.questao3.fase1refatoracao;

import atividade5.questao3.fase0procedural.MudancaDeEstadoNaoMapeadaException;

import java.time.LocalDate;

public class Processo {

    private static Integer processoAtual = 1;

    private Integer numeroProcesso;
    private LocalDate dataPrazoLegal;
    private EstadoDoProcesso estado;

    protected Processo() {

    }

    public EstadoDoProcesso getEstado() {
        return estado;
    }

    public void setEstado(EstadoDoProcesso estado) {
        this.estado = estado;
    }

    public Integer getNumeroProcesso() {
        return numeroProcesso;
    }

    public LocalDate getDataPrazoLegal() {
        return dataPrazoLegal;
    }

    public static Processo criarNovoProcesso() {
        var processo = new Processo();
        processo.numeroProcesso = processoAtual++;
//        processo.estadoDoProcesso = "GESTACAO";
//        System.out.println("Criando Processo.");
//        System.out.println("Estado inicial: " + processo.estadoDoProcesso);
        return processo;
    }

    public void validarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.printf("Validando processo número %d.\n", this.numeroProcesso);
        estado.validarProcesso();
    }

    public void cancalarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.printf("Cancelando processo número %d.\n", this.numeroProcesso);
        estado.cancelarProcesso();
    }

    public void designarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.printf("Designando processo número %d.\n", this.numeroProcesso);
        estado.designarProcesso();
    }

    public void deferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.printf("Deferindo processo número %d.\n", this.numeroProcesso);
        estado.deferirProcesso();
    }

    public void indeferirProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.printf("Indeferindo processo número %d.\n", this.numeroProcesso);
        estado.indeferirProcesso();
    }

    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.printf("Recorrendo processo número %d.\n", this.numeroProcesso);
        estado.recorrerProcesso();
    }

    public void transcorrerAte(LocalDate data) {
        if (this.estado instanceof EstadoAvaliado && data.isAfter(this.dataPrazoLegal)) {
            System.out.println("Transcorrido período legal.");
            System.out.println("Alterando status para FECHADO.");
            System.out.println("Estado antigo: " + this.estado);
            this.estado = new EstadoFechado(this);
            System.out.println("Novo estado: " + this.estado);
        }
    }

}

package atividade5.questao3.fase0procedural;

import java.time.LocalDate;

public class Processo {

    private static Integer processoAtual = 1;

    private Integer numeroProcesso;
    private LocalDate dataPrazoLegal;
    private String estadoDoProcesso;

    protected Processo() {

    }

    public Integer getNumeroProcesso() {
        return numeroProcesso;
    }

    public LocalDate getDataPrazoLegal() {
        return dataPrazoLegal;
    }

    public String getEstadoDoProcesso() {
        return estadoDoProcesso;
    }

    public static Processo criarNovoProcesso() {
        var processo = new Processo();
        processo.numeroProcesso = processoAtual++;
        processo.estadoDoProcesso = "GESTACAO";
        System.out.println("Criando Processo.");
        System.out.println("Estado inicial: " + processo.estadoDoProcesso);
        return processo;
    }

    public void validarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.printf("Validando processo número %d.\n", this.numeroProcesso);
        if ("GESTACAO".equals(this.estadoDoProcesso)) {
            System.out.println("Estado antigo: " + this.estadoDoProcesso);
            this.estadoDoProcesso = "CRIADO";
            System.out.println("Novo estado: " + this.estadoDoProcesso);
        } else {
            throw new MudancaDeEstadoNaoMapeadaException("Não é possível validar enquanto o processo está no estado " + this.estadoDoProcesso);
        }
    }

    public void cancalarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.printf("Cancelando processo número %d.\n", this.numeroProcesso);
        if ("CRIADO".equals(this.estadoDoProcesso)) {
            System.out.println("Estado antigo: " + this.estadoDoProcesso);
            this.estadoDoProcesso = "FECHADO";
            System.out.println("Novo estado: " + this.estadoDoProcesso);
        } else {
            throw new MudancaDeEstadoNaoMapeadaException("Não é possível cancelar enquanto o processo está no estado " + this.estadoDoProcesso);
        }
    }

    public void designarProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.printf("Designando processo número %d.\n", this.numeroProcesso);
        switch (this.estadoDoProcesso) {
            case "CRIADO" -> {
                System.out.println("Estado antigo: " + this.estadoDoProcesso);
                this.estadoDoProcesso = "EM_AVALIACAO";
                // Envia Email
                System.out.printf("Enviando email para notificar sobre o processo número %d.\n", this.numeroProcesso);
                this.dataPrazoLegal = LocalDate.now().plusDays(2);
                System.out.println("Novo estado: " + this.estadoDoProcesso);
            }

            case "EM_RECURSO" -> {
                System.out.println("Estado antigo: " + this.estadoDoProcesso);
                this.estadoDoProcesso = "EM_AVALIACAO";
                System.out.println("Novo estado: " + this.estadoDoProcesso);
            }

            default -> throw new MudancaDeEstadoNaoMapeadaException("Não é possível designar enquanto o processo está no estado " + this.estadoDoProcesso);
        }
    }

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

    public void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException {
        System.out.printf("Recorrendo processo número %d.\n", this.numeroProcesso);
        if ("INDEFERIDO".equals(this.estadoDoProcesso)) {
            System.out.println("Estado antigo: " + this.estadoDoProcesso);
            this.estadoDoProcesso = "EM_RECURSO";
            System.out.println("Novo estado: " + this.estadoDoProcesso);
        } else {
            throw new MudancaDeEstadoNaoMapeadaException("Não é possível recorrer enquanto o processo está no estado " + this.estadoDoProcesso);
        }
    }

    public void transcorrerAte(LocalDate data) {
        if (
                ("EM_AVALIACAO".equals(this.estadoDoProcesso) || "INDEFERIDO".equals(this.estadoDoProcesso))
                        && data.isAfter(this.dataPrazoLegal)
        ) {
            System.out.println("Transcorrido período legal.");
            System.out.println("Alterando status para FECHADO.");
            System.out.println("Estado antigo: " + this.estadoDoProcesso);
            this.estadoDoProcesso = "FECHADO";
            System.out.println("Novo estado: " + this.estadoDoProcesso);
        }
    }

}

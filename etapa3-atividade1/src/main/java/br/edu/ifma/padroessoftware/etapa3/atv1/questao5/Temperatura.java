package br.edu.ifma.padroessoftware.etapa3.atv1.questao5;

public final class Temperatura {

    private static final Temperatura self = new Temperatura(30);

    private Integer temperatura;

    private Temperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public static Temperatura getInstance() {
        return self;
    }

    public void estadoInicial() {
        temperatura = 30;
    }

    public void aumentar() {
        temperatura += 1;
    }

    public void diminuir() {
        temperatura -= 1;
    }

    public void diminuir20Graus() {
        temperatura -= 20;
    }

    @Override
    public String toString() {
        return temperatura + "ºC";
    }

}

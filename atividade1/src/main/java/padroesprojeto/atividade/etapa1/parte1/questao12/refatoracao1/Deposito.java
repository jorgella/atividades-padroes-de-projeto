package padroesprojeto.atividade.etapa1.parte1.questao12.refatoracao1;

import java.util.Calendar;

public class Deposito {

    private String numeroEnvelope;
    private Movimentacao movimentacao;

    public String getNumeroEnvelope() {
        return numeroEnvelope;
    }

    public void setNumeroEnvelope(String numeroEnvelope) {
        this.numeroEnvelope = numeroEnvelope;
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }

    public Double getValor() {
        return movimentacao.getValor();
    }

    public Conta getConta() {
        return movimentacao.getConta();
    }

    public Calendar getData() {
        return movimentacao.getData();
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "numeroEnvelope='" + numeroEnvelope + '\'' +
                ", movimentacao=" + movimentacao +
                '}';
    }
}

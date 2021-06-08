package padroesprojeto.atividade.etapa1.parte1.questao12.refatoracao1;

import java.util.Calendar;

public class Movimentacao {

    private Double valor;
    private Conta conta;
    private Calendar data;

    public Double getEncargos() {
        return valor * 0.01;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Movimentacao{" +
                "valor=" + valor +
                ", conta=" + conta +
                ", data=" + data +
                '}';
    }
}

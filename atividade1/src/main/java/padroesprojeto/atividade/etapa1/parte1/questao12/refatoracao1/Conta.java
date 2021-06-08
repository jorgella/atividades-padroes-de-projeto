package padroesprojeto.atividade.etapa1.parte1.questao12.refatoracao1;

public class Conta {

    private Double saldo = 0.00;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}

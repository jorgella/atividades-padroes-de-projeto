package atividade5.questao2.fase2comclasses;

public class ContaBancaria {

    private EstadoDaConta estadoDaConta;
    private Double saldo = 0d;

    public ContaBancaria() {
        this.estadoDaConta = new Positivado(this);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setEstadoDaConta(EstadoDaConta estadoDaConta) {
        this.estadoDaConta = estadoDaConta;
    }

    public Double realizarSaque(Double valor) throws Exception {
        if (valor < 0d) throw new IllegalArgumentException("Valor negativo");
        System.out.println("Estado inicial: " + estadoDaConta);
        Double res = estadoDaConta.realizarSaque(valor);
        System.out.println("Estado final: " + estadoDaConta);
        return res;
    }

    public Double realizarDeposito(Double valor) {
        if (valor < 0d) throw new IllegalArgumentException("Valor negativo");
        System.out.println("Estado inicial: " + estadoDaConta);
        Double res = estadoDaConta.realizarDeposito(valor);
        System.out.println("Estado final: " + estadoDaConta);
        return res;
    }

}

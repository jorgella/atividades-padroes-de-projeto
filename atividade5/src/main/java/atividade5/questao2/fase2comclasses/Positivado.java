package atividade5.questao2.fase2comclasses;

public class Positivado implements EstadoDaConta {

    private final ContaBancaria conta;

    public Positivado(ContaBancaria contaBancaria) {
        this.conta = contaBancaria;
    }

    @Override
    public Double realizarSaque(Double value) throws Exception {
        System.out.println("Sacando de conta positivada.");
        Double saldoAnterior = conta.getSaldo();
        Double novoSaldo = saldoAnterior - value;
        conta.setSaldo(novoSaldo);
        System.out.printf("Saldo anterior %.2f. Saldo atual %.2f%n", saldoAnterior, novoSaldo);
        if (novoSaldo < 0) {
            System.out.println("Mudando estado para conta negativada.");
            conta.setEstadoDaConta(new Negativado(conta));
        }
        return novoSaldo;
    }

    @Override
    public Double realizarDeposito(Double valor) {
        System.out.printf("Depositando %.2f em conta positivada.\n", valor);
        final Double saldoAnterior = conta.getSaldo();
        final Double novoSaldo = saldoAnterior + (valor * 0.98d);
        conta.setSaldo(novoSaldo);
        System.out.printf("Saldo anterior %.2f. Saldo atual %.2f%n", saldoAnterior, novoSaldo);
        return novoSaldo;
    }

    @Override
    public String toString() {
        return "POSITIVADO";
    }

}

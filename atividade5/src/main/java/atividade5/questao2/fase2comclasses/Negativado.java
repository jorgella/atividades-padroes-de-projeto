package atividade5.questao2.fase2comclasses;

public class Negativado implements EstadoDaConta {

    private final ContaBancaria conta;

    public Negativado(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public Double realizarSaque(Double value) throws Exception {
        System.out.println("Nao pode sacar de conta negativada");
        throw new Exception("Conta negativada");
    }

    @Override
    public Double realizarDeposito(Double valor) {
        System.out.println("Depositando em conta nagativada.");
        final Double saldoAnterior = conta.getSaldo();
        final Double novoSaldo = saldoAnterior + (valor * 0.95);
        conta.setSaldo(novoSaldo);
        System.out.printf("Saldo anterior %.2f. Saldo atual %.2f%n", saldoAnterior, novoSaldo);
        if (novoSaldo > 0d) {
            System.out.println("Mudando estado para conta positivada.");
            conta.setEstadoDaConta(new Positivado(conta));
        }

        return novoSaldo;
    }

    @Override
    public String toString() {
        return "NEGATIVADO";
    }

}

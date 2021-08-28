package atividade5.questao2.fase0procedural;

public class ContaBancaria {

    private EstadoDaConta estadoDaConta;
    private Double saldo = 0d;

    public ContaBancaria() {
        this.estadoDaConta = EstadoDaConta.POSITIVADO;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setEstadoDaConta(EstadoDaConta estadoDaConta) {
        this.estadoDaConta = estadoDaConta;
    }

    public Double realizarSaque(Double valor) throws Exception {
        if (valor < 0d) throw new IllegalArgumentException("Valor negativo.");
        switch (estadoDaConta) {
            case POSITIVADO -> {
                System.out.println("Sacando de conta positivada.");
                Double saldoAnterior = this.getSaldo();
                Double novoSaldo = saldoAnterior - valor;
                this.saldo = novoSaldo;
                System.out.printf("Saldo anterior %.2f. Saldo atual %.2f%n", saldoAnterior, novoSaldo);
                if (novoSaldo < 0) {
                    System.out.println("Mudando estado para conta negativada.");
                    this.setEstadoDaConta(EstadoDaConta.NEGATIVADO);
                }
                return novoSaldo;
            }

            case NEGATIVADO -> {
                System.out.println("Nao pode sacar de conta negativada");
                throw new Exception("Conta negativada.");
            }


            default -> throw new Exception("Estado não mapeado.");
        }


    }

    public Double realizarDeposito(Double valor) {
        if (valor < 0d) throw new IllegalArgumentException("Valor negativo");
        System.out.println("Estado inicial: " + estadoDaConta);
        switch (estadoDaConta) {
            case POSITIVADO -> {
                System.out.printf("Depositando %.2f em conta positivada.\n", valor);
                final Double saldoAnterior = this.getSaldo();
                final Double novoSaldo = saldoAnterior + (valor * 0.98d);
                this.saldo = novoSaldo;
                System.out.printf("Saldo anterior %.2f. Saldo atual %.2f%n", saldoAnterior, novoSaldo);
                System.out.println("Estado final: " + estadoDaConta);
                return novoSaldo;
            }

            case NEGATIVADO -> {
                System.out.println("Depositando em conta nagativada.");
                final Double saldoAnterior = this.getSaldo();
                final Double novoSaldo = saldoAnterior + (valor * 0.95);
                this.saldo = novoSaldo;
                System.out.printf("Saldo anterior %.2f. Saldo atual %.2f%n", saldoAnterior, novoSaldo);
                if (novoSaldo > 0d) {
                    System.out.println("Mudando estado para conta positivada.");
                    this.setEstadoDaConta(EstadoDaConta.POSITIVADO);
                }
                System.out.println("Estado final: " + estadoDaConta);
                return novoSaldo;
            }

            default -> {
                System.out.println("Estado final: " + estadoDaConta);
                throw new RuntimeException("Estado não mapeado.");
            }
        }
    }

}

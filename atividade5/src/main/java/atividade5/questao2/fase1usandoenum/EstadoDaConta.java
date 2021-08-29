package atividade5.questao2.fase1usandoenum;

enum EstadoDaConta {

    POSITIVADO {
        @Override
        public Double realizarSaque(ContaBancaria conta, Double value) throws Exception {
            System.out.println("Sacando de conta positivada.");
            Double saldoAnterior = conta.getSaldo();
            Double novoSaldo = saldoAnterior - value;
            conta.setSaldo(novoSaldo);
            System.out.printf("Saldo anterior %.2f. Saldo atual %.2f%n", saldoAnterior, novoSaldo);
            if (novoSaldo < 0) {
                System.out.println("Mudando estado para conta negativada.");
                conta.setEstadoDaConta(NEGATIVADO);
            }
            return novoSaldo;
        }

        @Override
        public Double realizarDeposito(ContaBancaria conta, Double valor) {
            System.out.printf("Depositando %.2f em conta positivada.\n", valor);
            final Double saldoAnterior = conta.getSaldo();
            final Double novoSaldo = saldoAnterior + (valor * 0.98d);
            conta.setSaldo(novoSaldo);
            System.out.printf("Saldo anterior %.2f. Saldo atual %.2f%n", saldoAnterior, novoSaldo);
            return novoSaldo;
        }
    },

    NEGATIVADO {
        @Override
        public Double realizarSaque(ContaBancaria conta, Double value) throws Exception {
            System.out.println("Nao pode sacar de conta negativada");
            throw new Exception("Conta negativada");
        }

        @Override
        public Double realizarDeposito(ContaBancaria conta, Double valor) {
            System.out.println("Depositando em conta nagativada.");
            final Double saldoAnterior = conta.getSaldo();
            final Double novoSaldo = saldoAnterior + (valor * 0.95);
            conta.setSaldo(novoSaldo);
            System.out.printf("Saldo anterior %.2f. Saldo atual %.2f%n", saldoAnterior, novoSaldo);
            if (novoSaldo > 0d) {
                System.out.println("Mudando estado para conta positivada.");
                conta.setEstadoDaConta(POSITIVADO);
            }

            return novoSaldo;
        }
    };

    public abstract Double realizarSaque(ContaBancaria conta, Double value) throws Exception;

    public abstract Double realizarDeposito(ContaBancaria conta, Double valor);

}

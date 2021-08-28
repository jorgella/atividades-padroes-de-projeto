package atividade5.questao2.fase0procedural.teste;

import atividade5.questao2.fase0procedural.ContaBancaria;

public class Main {

    public static void main(String[] args) {
        final var deposito = 100d;
        final var saque = 50d;

        System.out.print("\n\n\n\nTeste 1: tudo positivo.\n\n");

        final ContaBancaria conta1 = new ContaBancaria();
        System.out.println("Saldo inicial da conta1: " + conta1.getSaldo());
        conta1.realizarDeposito(deposito);
        System.out.println("Saldo final da conta1: " + conta1.getSaldo());


        System.out.print("\n\n\n\nTeste 2: saque em conta positivada.\n\n");

        try {
            final ContaBancaria conta2 = new ContaBancaria();
            System.out.println("Saldo inicial da conta2: " + conta2.getSaldo());
            conta2.realizarSaque(saque);
            System.out.println("Saldo final da conta2: " + conta2.getSaldo());
        } catch (Exception e) {
            System.out.println("[Err] Não deve chegar aqui.");
        }


        System.out.print("\n\n\n\nTeste 3: saque em conta negativada.\n\n");

        final ContaBancaria conta3 = new ContaBancaria();
        try {
            System.out.println("Saldo inicial da conta3: " + conta3.getSaldo());
            conta3.realizarSaque(saque);
            System.out.println("Saldo intermediário da conta3: " + conta3.getSaldo());
            conta3.realizarSaque(saque);
            System.out.println("[Err] Não deve chegar aqui.");
        } catch (Exception e) {
            System.out.println("Chegou aqui pois não pode ter saque quando conta está negativada. Saldo final da conta3: " + conta3.getSaldo());
        }


        System.out.print("\n\n\n\nTeste 4: Positivando conta negativada.\n\n");

        try {
            final ContaBancaria conta4 = new ContaBancaria();
            System.out.println("Saldo inicial da conta4: " + conta4.getSaldo());
            conta4.realizarSaque(saque);
            System.out.println("Saldo intermediário da conta4: " + conta4.getSaldo());
            conta4.realizarDeposito(deposito);
            System.out.println("Saldo final da conta4: " + conta4.getSaldo());
        } catch (Exception e) {
            System.out.println("Não deve chegar aqui.");
        }
    }

}

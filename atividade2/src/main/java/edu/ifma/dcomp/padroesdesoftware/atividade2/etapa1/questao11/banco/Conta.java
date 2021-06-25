package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conta {

    private final String titular;
    private final Long agencia;
    private final Long numeroConta;
    private final BigDecimal saldo;

    public Conta(String titular, Long agencia, Long numeroConta, BigDecimal saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Long getAgencia() {
        return agencia;
    }

    public Long getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo.setScale(2, RoundingMode.FLOOR);
    }

}

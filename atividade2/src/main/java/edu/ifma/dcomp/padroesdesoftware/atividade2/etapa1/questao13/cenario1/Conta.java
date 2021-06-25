package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario1;

import java.math.BigDecimal;

public class Conta {

    private final Integer numero;
    private final BigDecimal saldo;

    public Conta(Integer numero, BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

}

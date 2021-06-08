package padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1;

import java.math.BigDecimal;

public class Conta {

    private BigDecimal saldo = BigDecimal.ZERO;

    public void adicionarSaldo(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Saldo adicionado não pode ser negativo.");
        }
        this.saldo = this.saldo.add(valor);
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

}

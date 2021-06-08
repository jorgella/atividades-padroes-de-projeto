package padroesprojeto.atividade.etapa1.parte1.questao11.cenarioimplementacaoprocedural;

import java.math.BigDecimal;

public class Conta {

    public BigDecimal saldo = BigDecimal.ZERO;

    public void adicionarSaldo(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor passado não pode ser negativo.");
        }
        this.saldo = this.saldo.add(valor);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

}

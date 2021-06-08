package padroesprojeto.atividade.etapa1.parte1.questao11.cenarioimplementacaoprocedural;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void naoDeveAdicionarSaldoNegativo() {
        var conta = new Conta();
        assertThrows(IllegalArgumentException.class,
                () -> conta.adicionarSaldo(new BigDecimal("-0.01")),
                "Saldo adicionado não pode ser negativo.");
    }


}
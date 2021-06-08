package padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RealizadorDeInvestimentosTest {

    private Conta conta;
    private RealizadorDeInvestimentos realizadorDeInvestimentos;

    @BeforeEach
    void setup() {
        conta = new Conta();
        var estrategiaDeInvestimento = new InvestimentoConservador();
        realizadorDeInvestimentos = new RealizadorDeInvestimentos(conta, estrategiaDeInvestimento);
    }

    @Test
    void deveAdicionarOValorDescontadoImposto() {
        realizadorDeInvestimentos.resgataInvestimento(new BigDecimal("1000.00"));

        // 1_000 * 0.8 = 8.00
        // 75% * 8.0 = 6.00
        // 1_000 + 6.00 = 1006.00

        assertEquals(new BigDecimal("1006.00"), conta.getSaldo());
    }

}
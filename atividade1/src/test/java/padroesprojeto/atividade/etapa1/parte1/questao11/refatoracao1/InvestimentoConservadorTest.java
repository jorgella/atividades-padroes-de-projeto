package padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class InvestimentoConservadorTest {

    private EstrategiaDeInvestimento estrategiaDeInvestimento;

    @BeforeEach
    void setup() {
        estrategiaDeInvestimento = new InvestimentoConservador();
    }

    @Test
    void deveCalcularRetornoDeInvestimentoConservador() {
        BigDecimal retorno = estrategiaDeInvestimento.calcularRetorno(new BigDecimal("100.00"));

        assertEquals(new BigDecimal("0.80"), retorno);
    }
}
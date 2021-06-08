package padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.mock;

class InvestimentoModeradoTest {

    private Random determinante;
    private EstrategiaDeInvestimento estrategiaDeInvestimento;

    @BeforeEach
    void setup() {
        determinante = mock(Random.class);
        estrategiaDeInvestimento = new InvestimentoModerado(determinante);
    }

    @Test
    void deveCalcularRetornoDeInvestimentoArrojadoComLucroMaximo() {
        given(determinante.nextBoolean()).willReturn(true);
        BigDecimal retorno = estrategiaDeInvestimento.calcularRetorno(new BigDecimal("100.00"));

        assertEquals(new BigDecimal("2.50"), retorno);
    }

    @Test
    void deveCalcularRetornoDeInvestimentoModeradoComLucroMinimo() {
        given(determinante.nextBoolean()).willReturn(false);
        BigDecimal retorno = estrategiaDeInvestimento.calcularRetorno(new BigDecimal("100.00"));

        assertEquals(new BigDecimal("0.70"), retorno);
    }

}
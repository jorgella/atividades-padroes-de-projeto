package padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.mock;

class InvestimentoArrojadoTest {

    private Random determinante;
    private EstrategiaDeInvestimento estrategiaDeInvestimento;

    @BeforeEach
    void setup() {
        determinante = mock(Random.class);
        estrategiaDeInvestimento = new InvestimentoArrojado(determinante);
    }

    @Test
    void deveCalcularRetornoDeInvestimentoArrojadoComLucroMaximo() {
        given(determinante.nextInt(10)).willReturn(0);
        BigDecimal retornoDeterminanteMaximo = estrategiaDeInvestimento.calcularRetorno(new BigDecimal("100.00"));

        assertEquals(new BigDecimal("5.00"), retornoDeterminanteMaximo);

        given(determinante.nextInt(10)).willReturn(1);
        BigDecimal retornoDeterminanteMinimo = estrategiaDeInvestimento.calcularRetorno(new BigDecimal("100.00"));

        assertEquals(new BigDecimal("5.00"), retornoDeterminanteMinimo);
    }

    @Test
    void deveCalcularRetornoDeInvestimentoArrojadoComLucroMediano() {
        given(determinante.nextInt(10)).willReturn(2);
        BigDecimal retornoDeterminanteMaximo = estrategiaDeInvestimento.calcularRetorno(new BigDecimal("100.00"));

        assertEquals(new BigDecimal("3.00"), retornoDeterminanteMaximo);

        given(determinante.nextInt(10)).willReturn(4);
        BigDecimal retornoDeterminanteMinimo = estrategiaDeInvestimento.calcularRetorno(new BigDecimal("100.00"));

        assertEquals(new BigDecimal("3.00"), retornoDeterminanteMinimo);
    }

    @Test
    void deveCalcularRetornoDeInvestimentoArrojadoComLucroMinimo() {
        given(determinante.nextInt(10)).willReturn(5);
        BigDecimal retornoDeterminanteMaximo = estrategiaDeInvestimento.calcularRetorno(new BigDecimal("100.00"));

        assertEquals(new BigDecimal("0.60"), retornoDeterminanteMaximo);

        given(determinante.nextInt(10)).willReturn(9);
        BigDecimal retornoDeterminanteMinimo = estrategiaDeInvestimento.calcularRetorno(new BigDecimal("100.00"));

        assertEquals(new BigDecimal("0.60"), retornoDeterminanteMinimo);
    }

}
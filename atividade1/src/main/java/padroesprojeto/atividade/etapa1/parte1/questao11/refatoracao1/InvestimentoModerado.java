package padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class InvestimentoModerado implements EstrategiaDeInvestimento {

    private final Random determinante;

    public InvestimentoModerado() {
        determinante = new Random();
    }

    InvestimentoModerado(Random determinante) {
        this.determinante = determinante;
    }

    @Override
    public BigDecimal calcularRetorno(BigDecimal resgate) {
        BigDecimal taxaRetorno;

        if (determinante.nextBoolean()) {
            taxaRetorno = new BigDecimal("0.025");
        } else {
            taxaRetorno = new BigDecimal("0.007");
        }

        return resgate.multiply(taxaRetorno).setScale(2, RoundingMode.CEILING);
    }

}

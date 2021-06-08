package padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class InvestimentoArrojado implements EstrategiaDeInvestimento {

    private final Random determinante;

    public InvestimentoArrojado() {
        determinante = new Random();
    }

    InvestimentoArrojado(Random determinante) {
        this.determinante = determinante;
    }

    @Override
    public BigDecimal calcularRetorno(BigDecimal resgate) {
        BigDecimal taxaRetorno;
        var sorte = determinante.nextInt(10);

        if (sorte < 2) {
            taxaRetorno = new BigDecimal("0.05");
        } else if (sorte < 5) {
            taxaRetorno = new BigDecimal("0.03");
        } else {
            taxaRetorno = new BigDecimal("0.006");
        }

        return resgate.multiply(taxaRetorno).setScale(2, RoundingMode.CEILING);
    }

}

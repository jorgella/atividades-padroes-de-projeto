package padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InvestimentoConservador implements EstrategiaDeInvestimento {

    @Override
    public BigDecimal calcularRetorno(BigDecimal resgate) {
        return resgate.multiply(new BigDecimal("0.008")).setScale(2, RoundingMode.CEILING);
    }

}

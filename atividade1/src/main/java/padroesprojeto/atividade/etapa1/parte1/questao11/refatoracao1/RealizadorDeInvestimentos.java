package padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RealizadorDeInvestimentos {

    private final Conta conta;
    private final EstrategiaDeInvestimento estrategiaDeInvestimento;

    public RealizadorDeInvestimentos(Conta conta, EstrategiaDeInvestimento estrategiaDeInvestimento) {
        this.conta = conta;
        this.estrategiaDeInvestimento = estrategiaDeInvestimento;
    }

    public void resgataInvestimento(BigDecimal resgate) {
        var resultado = estrategiaDeInvestimento.calcularRetorno(resgate);
        var valorAdicionado =
                resgate.add(resultado.multiply(new BigDecimal("0.75"))).setScale(2, RoundingMode.CEILING);

        conta.adicionarSaldo(valorAdicionado);
    }


}

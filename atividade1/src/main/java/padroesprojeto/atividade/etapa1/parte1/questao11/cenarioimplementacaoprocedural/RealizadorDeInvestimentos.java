package padroesprojeto.atividade.etapa1.parte1.questao11.cenarioimplementacaoprocedural;

import java.math.BigDecimal;
import java.util.Random;

public class RealizadorDeInvestimentos {

    private final Conta conta;

    public RealizadorDeInvestimentos(Conta conta) {
        this.conta = conta;
    }

    public BigDecimal resgataInvestimento(BigDecimal resgate, TipoDeInvestimento tipoDeInvestimento) {
        var resultado = this.calcularRetornoBase(resgate, tipoDeInvestimento);
        var valorAdicionado = resgate.add(resultado.multiply(new BigDecimal("0.75")));
        conta.adicionarSaldo(valorAdicionado);

        return valorAdicionado;
    }

    private BigDecimal calcularRetornoBase(BigDecimal resgate, TipoDeInvestimento tipoDeInvestimento) {
        BigDecimal taxaRetorno = BigDecimal.ZERO;

        switch (tipoDeInvestimento) {
            case CONSERVADOR:
                taxaRetorno = new BigDecimal("0.008");

                break;
            case MODERADO:
                if (new Random().nextBoolean()) {
                    taxaRetorno = new BigDecimal("0.02_5");
                } else {
                    taxaRetorno = new BigDecimal("0.007");
                }

                break;
            case ARROJADO:
                int sorte = new Random().nextInt(10);

                if (sorte < 2) {
                    taxaRetorno = new BigDecimal("0.05");
                } else if (sorte < 5) {
                    taxaRetorno = new BigDecimal("0.03");
                } else {
                    taxaRetorno = new BigDecimal("0.006");
                }

                break;
        }

        return resgate.multiply(taxaRetorno);
    }

}

package padroesprojeto.atividade.etapa1.parte1.questao11.cenarioimplementacaoprocedural.testemanual;


import padroesprojeto.atividade.etapa1.parte1.questao11.cenarioimplementacaoprocedural.Conta;
import padroesprojeto.atividade.etapa1.parte1.questao11.cenarioimplementacaoprocedural.RealizadorDeInvestimentos;
import padroesprojeto.atividade.etapa1.parte1.questao11.cenarioimplementacaoprocedural.TipoDeInvestimento;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        var conta1 = new Conta();

        RealizadorDeInvestimentos realizadorDeInvestimentosArrojados = new RealizadorDeInvestimentos(conta1);
        realizadorDeInvestimentosArrojados.resgataInvestimento(new BigDecimal("100.00"), TipoDeInvestimento.ARROJADO);

        System.out.println("Valor após resgate da aplicação arrojada: " + conta1.getSaldo());

        var conta2 = new Conta();

        RealizadorDeInvestimentos realizadorDeInvestimentosModerados = new RealizadorDeInvestimentos(conta2);
        realizadorDeInvestimentosModerados.resgataInvestimento(new BigDecimal("100.00"), TipoDeInvestimento.MODERADO);

        System.out.println("Valor após resgate da aplicação moderada: " + conta2.getSaldo());

        var conta3 = new Conta();

        RealizadorDeInvestimentos realizadorDeInvestimentosConservadores = new RealizadorDeInvestimentos(conta3);
        realizadorDeInvestimentosConservadores.resgataInvestimento(new BigDecimal("100.00"), TipoDeInvestimento.CONSERVADOR);

        System.out.println("Valor após resgate da aplicação conservadora: " + conta3.getSaldo());
    }
}

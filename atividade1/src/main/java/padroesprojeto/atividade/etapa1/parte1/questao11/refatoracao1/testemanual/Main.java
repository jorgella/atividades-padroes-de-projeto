package padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1.testemanual;


import padroesprojeto.atividade.etapa1.parte1.questao11.refatoracao1.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        var conta = new Conta();

        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos(conta, new InvestimentoArrojado());
        realizadorDeInvestimentos.resgataInvestimento(new BigDecimal("100.00"));

        System.out.println("Valor após resgate da aplicação arrojada: " + conta.getSaldo());

        var conta2 = new Conta();

        RealizadorDeInvestimentos realizadorDeInvestimentosModerados = new RealizadorDeInvestimentos(conta2, new InvestimentoModerado());
        realizadorDeInvestimentosModerados.resgataInvestimento(new BigDecimal("100.00"));

        System.out.println("Valor após resgate da aplicação moderada: " + conta2.getSaldo());

        var conta3 = new Conta();

        RealizadorDeInvestimentos realizadorDeInvestimentosConservadores = new RealizadorDeInvestimentos(conta3, new InvestimentoConservador());
        realizadorDeInvestimentosConservadores.resgataInvestimento(new BigDecimal("100.00"));

        System.out.println("Valor após resgate da aplicação conservadora: " + conta3.getSaldo());
    }
}

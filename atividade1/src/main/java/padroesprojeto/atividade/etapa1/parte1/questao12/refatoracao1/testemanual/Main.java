package padroesprojeto.atividade.etapa1.parte1.questao12.refatoracao1.testemanual;

import padroesprojeto.atividade.etapa1.parte1.questao12.refatoracao1.Conta;
import padroesprojeto.atividade.etapa1.parte1.questao12.refatoracao1.Deposito;
import padroesprojeto.atividade.etapa1.parte1.questao12.refatoracao1.Movimentacao;
import padroesprojeto.atividade.etapa1.parte1.questao12.refatoracao1.Pagamento;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta();

        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setValor(10.00);
        movimentacao.setConta(conta);
        movimentacao.setData(Calendar.getInstance());

        System.out.println("Movimentação: " + movimentacao);
        System.out.println("Encargos de Movimentação: " + movimentacao.getEncargos());

        Pagamento pagamento = new Pagamento();
        pagamento.setFavorecido("Gabriel");
        pagamento.setFormaDePagemento("Boleto");
        pagamento.setMovimentacao(movimentacao);

        System.out.println("Pagamento: " + pagamento);
        System.out.println("Encargos de Pagamento: " + pagamento.getEncargos());

        Deposito deposito =  new Deposito();
        deposito.setNumeroEnvelope("1");
        deposito.setMovimentacao(movimentacao);

        System.out.println("Deposito: " + deposito);
    }

}

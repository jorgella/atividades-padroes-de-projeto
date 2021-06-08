package padroesprojeto.atividade.etapa1.parte1.questao12.cenariobase.testemanual;

import padroesprojeto.atividade.etapa1.parte1.questao12.cenariobase.Conta;
import padroesprojeto.atividade.etapa1.parte1.questao12.cenariobase.Deposito;
import padroesprojeto.atividade.etapa1.parte1.questao12.cenariobase.Movimentacao;
import padroesprojeto.atividade.etapa1.parte1.questao12.cenariobase.Pagamento;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        var conta = new Conta();

        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setValor(10.00);
        movimentacao.setConta(conta);
        movimentacao.setData(Calendar.getInstance());

        System.out.println("Movimentação: " + movimentacao);
        System.out.println("Encargos de Movimentação: " + movimentacao.getEncargos());

        Movimentacao pagamento = new Pagamento();
        pagamento.setValor(10.00);
        pagamento.setConta(conta);
        pagamento.setData(Calendar.getInstance());

        System.out.println("Pagamento: " + pagamento);
        System.out.println("Encargos de Pagamento: " + pagamento.getEncargos());

        Movimentacao deposito =  new Deposito();
        deposito.setValor(10.00);
        deposito.setConta(conta);
        deposito.setData(Calendar.getInstance());

        System.out.println("Deposito: " + deposito);
        System.err.println("Encargos de Deposito: " + deposito.getEncargos()); // Lança RuntimeException
    }

}

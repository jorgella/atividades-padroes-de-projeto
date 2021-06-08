package padroesprojeto.atividade.etapa1.parte1.questao10.refatoracao1;

import java.text.MessageFormat;

public class Estagiario implements Recebedor {

    @Override
    public Double getGratificacaoBase() {
        return 1_000.00;
    }

    @Override
    public Double getBonificacoes() {
        return 0.00;
    }

    @Override
    public void depositaNaConta(Double valor) {
        System.out.println(MessageFormat.format("Depositando R$ {0} por TED", valor));
    }

   
}

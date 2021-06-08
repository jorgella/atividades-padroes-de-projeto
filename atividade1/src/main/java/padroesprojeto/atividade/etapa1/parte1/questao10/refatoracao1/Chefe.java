package padroesprojeto.atividade.etapa1.parte1.questao10.refatoracao1;

import java.text.MessageFormat;

public class Chefe implements Recebedor {

    public Double getGratificacaoBase() {
        return 5_000.00;
    }

    public Double getBonificacoes() {
        return 2_000.00;
    }

    public void depositaNaConta(Double valor) {
        System.out.println(MessageFormat.format("Depositando R$ {0} por TED", valor));
    }

}

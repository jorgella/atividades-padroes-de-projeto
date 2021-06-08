package padroesprojeto.atividade.etapa1.parte1.questao10.refatoracao1;

import java.text.MessageFormat;

public class Funcionario implements Recebedor {

    @Override
    public Double getGratificacaoBase() {
        return 3_000.00;
    }

    @Override
    public Double getBonificacoes() {
        return 200.00;
    }

    public void depositaNaConta(Double valor) {
        System.out.println(MessageFormat.format("Depositando R$ {0} por Pix", valor));
    }

}

package padroesprojeto.atividade.etapa1.parte1.questao10.refatoracao1;

public class PagadorDeFuncionario {

    public void pagar(Recebedor recebedor) {
        recebedor.depositaNaConta(recebedor.getGratificacaoBase() + recebedor.getBonificacoes());
    }

}

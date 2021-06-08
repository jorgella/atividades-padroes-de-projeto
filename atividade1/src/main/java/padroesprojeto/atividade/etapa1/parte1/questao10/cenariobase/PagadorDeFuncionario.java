package padroesprojeto.atividade.etapa1.parte1.questao10.cenariobase;

public class PagadorDeFuncionario {

    public void pagaChefe(Chefe chefe) {
        chefe.depositaNaConta(chefe.getSalarioBase() + chefe.getBonificacoes());
    }

    public void pagaChefe(Funcionario funcionario) {
        funcionario.depositaNaConta(funcionario.getSalario() + funcionario.getBonus());
    }
    
    public void pagaEstagiario(Estagiario funcionario) {
        funcionario.depositaNaConta(funcionario.getBolsa() + funcionario.getBonus());
    }

}

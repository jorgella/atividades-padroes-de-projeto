package padroesprojeto.atividade.etapa1.parte1.questao12.cenariobase;

public class Deposito extends Movimentacao {

    private String numeroEnvelope;

    @Override
    public Double getEncargos() {
        throw new RuntimeException("Depositos não geram encargos.");
    }

    public String getNumeroEnvelope() {
        return numeroEnvelope;
    }

    public void setNumeroEnvelope(String numeroEnvelope) {
        this.numeroEnvelope = numeroEnvelope;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "numeroEnvelope='" + numeroEnvelope + '\'' +
                '}';
    }
}

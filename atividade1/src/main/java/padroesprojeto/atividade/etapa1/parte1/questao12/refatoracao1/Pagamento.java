package padroesprojeto.atividade.etapa1.parte1.questao12.refatoracao1;

public class Pagamento {

    private String favorecido;
    private String formaDePagemento;
    private Movimentacao movimentacao;

    public String getFavorecido() {
        return favorecido;
    }

    public void setFavorecido(String favorecido) {
        this.favorecido = favorecido;
    }

    public String getFormaDePagemento() {
        return formaDePagemento;
    }

    public void setFormaDePagemento(String formaDePagemento) {
        this.formaDePagemento = formaDePagemento;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }

    public Double getEncargos() {
        return movimentacao.getEncargos();
    }

    public Double getValor() {
        return movimentacao.getValor();
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "favorecido='" + favorecido + '\'' +
                ", formaDePagemento='" + formaDePagemento + '\'' +
                ", movimentacao=" + movimentacao +
                '}';
    }

}



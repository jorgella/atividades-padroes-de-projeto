package padroesprojeto.atividade.etapa1.parte1.questao12.cenariobase;

public class Pagamento extends Movimentacao {

    private String favorecido;
    private String formaDePagemento;

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

    @Override
    public String toString() {
        return "Pagamento{" +
                "favorecido='" + favorecido + '\'' +
                ", formaDePagemento='" + formaDePagemento + '\'' +
                '}';
    }

}



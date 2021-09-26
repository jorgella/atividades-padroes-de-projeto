package atividade6.questao5;

public interface NotificadorDoBingo {

    void subscribe(CartelaObserver observer);

    void notificarAlteracao();

    void iniciarBingo(Integer maxNumber);

    void bingo(String bingo);

}

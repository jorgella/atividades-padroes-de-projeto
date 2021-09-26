package atividade6.questao5;

public class Main {

    public static void main(String[] args) {
        SistemaDeBingo system = SistemaDeBingo.getInstance();

        for (int i = 1; i <= 5; i++) {
            BingoCard bingoCard = new BingoCard(system, i, 6, 50);
            system.subscribe(bingoCard);
        }

        system.iniciarBingo(50);
    }

}

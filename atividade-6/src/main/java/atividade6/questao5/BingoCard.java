package atividade6.questao5;

import java.util.*;

public class BingoCard implements CartelaObserver {

    private static final Random RANDOM = new Random();

    private final NotificadorDoBingo assunto;
    private final Integer cardId;
    private final Map<Integer, Boolean> numerosGerados = new HashMap<>();

    public BingoCard(SistemaDeBingo subject, Integer cardId, int numberOfSlots, int maxNumber) {
        if (numberOfSlots <= 0) {
            throw new IllegalArgumentException("Invalid number of slots.");
        }

        if (maxNumber <= 0) {
            throw new IllegalArgumentException("Invalid max number.");
        }

        this.cardId = cardId;
        this.assunto = subject;

        do {
            numerosGerados.put(RANDOM.nextInt(maxNumber), false);
        } while (numerosGerados.size() != numberOfSlots);

    }

    @Override
    public void atualizar(Integer numero) {
        if (numerosGerados.containsKey(numero)) {
            System.out.printf("Card %d tem o número %d.%n", cardId, numero);
            numerosGerados.put(numero, true);
        }

        this.didIWin();
    }

    public Integer getCardId() {
        return cardId;
    }

    @Override
    public String toString() {
        return "BingoCard{" +
                "subject=" + assunto +
                ", cardId=" + cardId +
                ", numbers=" + numerosGerados +
                '}';
    }

    public boolean didIWin() {
        if (numerosGerados.values().stream().allMatch(v -> v)) {
            assunto.bingo(String.format("Bingo. %d ganhou.", this.cardId));
            return true;
        }

        return false;
    }

}

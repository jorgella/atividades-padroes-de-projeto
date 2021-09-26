package atividade6.questao5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SistemaDeBingo implements NotificadorDoBingo {

    private static final SistemaDeBingo SELF = new SistemaDeBingo();
    private static final Random SORTEADOR = new Random();

    private final List<CartelaObserver> cartelas;

    private Integer numeroSorteado;
    private boolean isJogoFinalizado = false;

    private final List<Integer> numerosSorteados = new LinkedList<>();

    private SistemaDeBingo() {
        this.cartelas = new ArrayList<>();
    }

    public static SistemaDeBingo getInstance() {
        return SELF;
    }

    @Override
    public void subscribe(CartelaObserver cartela) {
        cartelas.add(cartela);
    }

    @Override
    public void notificarAlteracao() {
        cartelas.forEach(c -> c.atualizar(numeroSorteado));
    }

    @Override
    public void iniciarBingo(Integer maxNumber) {
        while (!isJogoFinalizado) {
            numeroSorteado = SORTEADOR.nextInt(maxNumber);
            while (numerosSorteados.contains(numeroSorteado)) {
                numeroSorteado = SORTEADOR.nextInt(maxNumber);
            }
            numerosSorteados.add(numeroSorteado);
            System.out.printf("Bingo sorteou o número %d.%n", numeroSorteado);

            this.notificarAlteracao();
        }
    }

    @Override
    public void bingo(String bingo) {
        isJogoFinalizado = true;
        System.out.println(bingo);
    }

}

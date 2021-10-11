package br.edu.ifma.padroessoftware.etapa3.atv1.questao5;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt3.Logger;

import java.util.concurrent.TimeUnit;

public final class DiminuicaoTemperaturaCommand implements RoboAction {

    private static final Temperatura temperatura = Temperatura.getInstance();

    @Override
    public void execute() {
        Logger log = Logger.LoggerFactory.getActiveLogger();
        log.log("Diminuindo temperatura.");
        for (int i = 0; i < 10; i++) {
            try {
                log.log("Temperatura atual " + temperatura);
                TimeUnit.MILLISECONDS.sleep(100);
                temperatura.diminuir();
                log.log("Temperatura nova: " + temperatura);
            } catch (Exception e) {
                log.log(e.getMessage());
            }
        }
    }

}
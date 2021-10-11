package br.edu.ifma.padroessoftware.etapa3.atv1.questao5;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt3.Logger;

import java.util.concurrent.TimeUnit;

public final class ElevacaoTemperaturaCommand implements RoboAction {

    private static final Temperatura temperatura = Temperatura.getInstance();

    @Override
    public void execute() {
        Logger log = Logger.LoggerFactory.getActiveLogger();
        log.log("Elevando temperatura.");
        for (int i = 0; i < 10; i++) {
            try {
                log.log("Temperatura atual " + temperatura);
                TimeUnit.MILLISECONDS.sleep(100);
                temperatura.aumentar();
                log.log("Temperatura nova: " + temperatura);
            } catch (Exception e) {
                log.log(e.getMessage());
            }
        }
    }

}

package br.edu.ifma.padroessoftware.etapa3.atv1.questao5;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt3.Logger;

import java.util.LinkedList;
import java.util.List;

public final class Experimento {

    private final List<RoboAction> roboActions = new LinkedList<>();

    public Experimento() {
        Temperatura.getInstance().estadoInicial();
    }

    public void execute() {
        Logger log = Logger.LoggerFactory.getActiveLogger();
        log.log("Experimento iniciado.");
        roboActions.forEach(RoboAction::execute);
        log.log("Experimento finalizado.");
    }

    public void addAction(RoboAction action) {
        roboActions.add(action);
    }

}

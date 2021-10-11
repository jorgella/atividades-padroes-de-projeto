package br.edu.ifma.padroessoftware.etapa3.atv1.questao5;

import br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt3.Logger;

public final class AplicacaoProdutoQuimicoCommand implements RoboAction {

    @Override
    public void execute() {
        Logger.LoggerFactory.getActiveLogger().log("Aplicando produto quimico.");
    }

}

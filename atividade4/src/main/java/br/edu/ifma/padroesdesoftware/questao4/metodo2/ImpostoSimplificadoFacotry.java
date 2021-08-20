package br.edu.ifma.padroesdesoftware.questao4.metodo2;

public class ImpostoSimplificadoFacotry implements ImpostoDeRendaFacotry {

    @Override
    public ImpostoDeRenda newImpostoDeRenda() {
        return new ImpostoDeRenda(new Simplificado());
    }

}

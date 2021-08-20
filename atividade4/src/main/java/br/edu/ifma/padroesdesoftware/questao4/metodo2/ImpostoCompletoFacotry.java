package br.edu.ifma.padroesdesoftware.questao4.metodo2;

public class ImpostoCompletoFacotry implements ImpostoDeRendaFacotry {

    @Override
    public ImpostoDeRenda newImpostoDeRenda() {
        return new ImpostoDeRenda(new Completo());
    }

}

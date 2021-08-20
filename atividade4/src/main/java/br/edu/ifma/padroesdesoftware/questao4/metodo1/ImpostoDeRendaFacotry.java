package br.edu.ifma.padroesdesoftware.questao4.metodo1;

public class ImpostoDeRendaFacotry {

    private ImpostoDeRendaFacotry() {

    }

    public static ImpostoDeRenda newImpostoDeRenda(String tipo) {
        if ("COMPLETO".equalsIgnoreCase(tipo)) {
            return new ImpostoDeRenda(new Completo());
        } else if ("SIMPLIFICADO".equalsIgnoreCase(tipo)) {
            return new ImpostoDeRenda(new Simplificado());
        } else {
            throw new ImpostoDeRendaException(String.format("Imposto de renda não pode ser declarado na modalidade %s.", tipo));
        }
    }

}

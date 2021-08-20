package br.edu.ifma.padroesdesoftware.questao4.metodo2;


public class Teste {

    public static void main(String[] args) {
        final ImpostoDeRenda completo = new ImpostoCompletoFacotry().newImpostoDeRenda();
        completo.calcula();

        final ImpostoDeRenda simplificado = new ImpostoSimplificadoFacotry().newImpostoDeRenda();
        simplificado.calcula();
    }

}

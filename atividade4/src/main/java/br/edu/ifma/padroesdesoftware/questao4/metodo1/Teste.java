package br.edu.ifma.padroesdesoftware.questao4.metodo1;

import java.math.BigDecimal;

public class Teste {

    public static void main(String[] args) {
        final ImpostoDeRenda completo = ImpostoDeRendaFacotry.newImpostoDeRenda("COMPLETO");
        completo.calcula();

        final ImpostoDeRenda simplificado = ImpostoDeRendaFacotry.newImpostoDeRenda("simplificado");
        simplificado.calcula();
    }

}

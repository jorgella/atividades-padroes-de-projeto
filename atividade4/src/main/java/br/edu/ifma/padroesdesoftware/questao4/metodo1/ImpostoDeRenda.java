package br.edu.ifma.padroesdesoftware.questao4.metodo1;

import java.math.BigDecimal;

public class ImpostoDeRenda {

    private final MetodoCalculo metodoCalculo;

    public ImpostoDeRenda(MetodoCalculo metodoCalculo) {
        this.metodoCalculo = metodoCalculo;
    }

    public BigDecimal calcula() {
        return metodoCalculo.calcula();
    }

}

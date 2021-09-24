package atividade6.questao3;

import java.util.stream.Collectors;

public class Mozzarella extends Pizza {

    public Mozzarella() {
        this.getDescriptions().add("Mozzarella Pizza");
    }

    @Override
    public double cost() {
        return 11.9;
    }

}

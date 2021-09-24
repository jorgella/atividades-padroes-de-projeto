package atividade6.questao3;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    private final List<String> descriptions = new ArrayList<>();

    public List<String> getDescriptions() {
        return descriptions;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return String.format("%s\t\t--- %.1f\n", String.join(", ", this.getDescriptions()), this.cost());
    }

}

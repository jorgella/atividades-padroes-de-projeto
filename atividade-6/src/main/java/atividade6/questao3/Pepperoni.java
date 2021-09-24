package atividade6.questao3;

public class Pepperoni extends Pizza {

    public Pepperoni() {
        this.getDescriptions().add("Pepperoni Pizza");
    }

    @Override
    public double cost() {
        return 14.9;
    }

}

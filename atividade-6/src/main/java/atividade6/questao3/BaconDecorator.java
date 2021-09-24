package atividade6.questao3;

public class BaconDecorator extends CondimentDecorator {
    public BaconDecorator(Pizza wrapper) {
        super(wrapper);
        this.getDescriptions().add("Bacon");
    }

    @Override
    public double cost() {
        return super.cost() + 0.8;
    }
}

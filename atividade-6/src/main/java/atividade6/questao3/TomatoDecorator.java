package atividade6.questao3;

public class TomatoDecorator extends CondimentDecorator {

    public TomatoDecorator(Pizza wrapper) {
        super(wrapper);
        getDescriptions().add("Tomato");
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }

}

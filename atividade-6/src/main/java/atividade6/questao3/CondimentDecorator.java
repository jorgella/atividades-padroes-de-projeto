package atividade6.questao3;

public class CondimentDecorator extends Pizza {

    private final Pizza wrapper;

    public CondimentDecorator(Pizza wrapper) {
        this.wrapper = wrapper;
        this.getDescriptions().addAll(wrapper.getDescriptions());
    }

    @Override
    public double cost() {
        return wrapper.cost();
    }

}

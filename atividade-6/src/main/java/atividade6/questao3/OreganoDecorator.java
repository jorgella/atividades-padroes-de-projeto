package atividade6.questao3;

public class OreganoDecorator extends CondimentDecorator {

    public OreganoDecorator(Pizza wrapper) {
        super(wrapper);
        this.getDescriptions().add("Oregano");
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

}

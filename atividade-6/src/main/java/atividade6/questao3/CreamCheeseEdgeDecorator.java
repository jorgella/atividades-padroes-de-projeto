package atividade6.questao3;

public class CreamCheeseEdgeDecorator extends CondimentDecorator {

    public CreamCheeseEdgeDecorator(Pizza wrapper) {
        super(wrapper);
        this.getDescriptions().add("CreamCheeseEdge");
    }

    @Override
    public double cost() {
        return super.cost() + 1.2;
    }

}

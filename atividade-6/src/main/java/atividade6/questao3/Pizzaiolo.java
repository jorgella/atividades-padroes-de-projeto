package atividade6.questao3;

public class Pizzaiolo {

    public static void main(String[] args) {
        System.out.print("Pizza\t\t--- Valor\n\n");
        Pizza mozzarella = new Mozzarella();
        System.out.println(mozzarella);

        Pizza mozzarellaTomato = new TomatoDecorator(new Mozzarella());
        System.out.println(mozzarellaTomato);

        Pizza mozzarellaTomatoCreamEdge = new CreamCheeseEdgeDecorator(new TomatoDecorator(new Mozzarella()));
        System.out.println(mozzarellaTomatoCreamEdge);

        Pizza pepperoni = new Pepperoni();
        System.out.println(pepperoni);

        Pizza pepperoniOreganoBacon = new BaconDecorator(new OreganoDecorator(new Pepperoni()));
        System.out.println(pepperoniOreganoBacon);

        Pizza pepperoniOreganoBaconTomato = new TomatoDecorator(new BaconDecorator(new OreganoDecorator(new Pepperoni())));
        System.out.println(pepperoniOreganoBaconTomato);
    }

}

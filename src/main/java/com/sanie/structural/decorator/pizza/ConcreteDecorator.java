package com.sanie.structural.decorator.pizza;

class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.25;
    }
}

class Pepperoni extends PizzaDecorator {

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.50;
    }
}

public class ConcreteDecorator extends PizzaDecorator {

    public ConcreteDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 0.75;
    }
}


package structural.decorator.abstractdecorator;

import structural.decorator.component.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public Double getCost() {
        return 0.0;
    }
}

package structural.decorator.concretedecorator;

import structural.decorator.abstractdecorator.CoffeeDecorator;
import structural.decorator.component.Coffee;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return  decoratedCoffee.getDescription() + " with added cow-milk";
    }

    @Override
    public Double getCost() {
        return decoratedCoffee.getCost() + 0.9;
    }
}

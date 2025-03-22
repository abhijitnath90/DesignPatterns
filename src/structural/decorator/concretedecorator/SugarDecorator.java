package structural.decorator.concretedecorator;

import structural.decorator.abstractdecorator.CoffeeDecorator;
import structural.decorator.component.Coffee;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with added sugar.";
    }

    @Override
    public Double getCost() {
        return decoratedCoffee.getCost() + 0.9;
    }
}

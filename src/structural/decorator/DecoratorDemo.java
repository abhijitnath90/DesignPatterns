package structural.decorator;

import structural.decorator.component.Coffee;
import structural.decorator.concretecomponent.PlainCoffee;
import structural.decorator.concretedecorator.MilkDecorator;
import structural.decorator.concretedecorator.SugarDecorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        //Plain Coffee
        Coffee coffee = new PlainCoffee();
        System.out.println("Description: "+coffee.getDescription());
        System.out.println("Cost: $"+coffee.getCost());

        //Coffee with Milk
        Coffee milkCoffee = new MilkDecorator(new PlainCoffee());
        System.out.println("\nDescription: "+milkCoffee.getDescription());
        System.out.println("Cost: $"+milkCoffee.getCost());

        //Coffee with Milk and Sugar
        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("\nDescription: "+sugarMilkCoffee.getDescription());
        System.out.println("Cost: $"+sugarMilkCoffee.getCost());
    }
}

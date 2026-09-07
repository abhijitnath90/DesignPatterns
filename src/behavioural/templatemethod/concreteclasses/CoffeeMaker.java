package behavioural.templatemethod.concreteclasses;

import behavioural.templatemethod.abstractclass.BeverageMaker;

public class CoffeeMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar.");
    }
}

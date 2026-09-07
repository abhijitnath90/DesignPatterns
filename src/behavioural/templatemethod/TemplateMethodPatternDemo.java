package behavioural.templatemethod;

import behavioural.templatemethod.abstractclass.BeverageMaker;
import behavioural.templatemethod.concreteclasses.CoffeeMaker;
import behavioural.templatemethod.concreteclasses.TeaMaker;

public class TemplateMethodPatternDemo {

    public static void main(String[] args) {
        System.out.println("Making tea: ");
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();

        System.out.println("\nMaking coffee: ");
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();
    }
}

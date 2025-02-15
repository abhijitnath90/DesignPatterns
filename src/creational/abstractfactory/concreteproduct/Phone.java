package creational.abstractfactory.concreteproduct;

public class Phone {

    String description;

    public Phone(String model) {
        this.description = model;
    }

    public String getDescription() {
        System.out.println(this.description);
        return description;
    }
}

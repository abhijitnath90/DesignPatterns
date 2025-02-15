package creational.abstractfactory.subfactory;

import creational.abstractfactory.concreteproduct.Phone;

import java.util.Objects;

public class Apple {

    private Apple() {

    }

    public static Phone getPhone(String model) {
        if(Objects.equals(model, "iPhone14"))
            return new Phone("iPhone14");
        else if(Objects.equals(model, "iPhone 14 pro"))
            return new Phone("iPhone 14 pro");
        else if(Objects.equals(model, "iPhone 14 pro max"))
            return new Phone("iPhone 14 pro max");
        return new NullPhone();
    }
}

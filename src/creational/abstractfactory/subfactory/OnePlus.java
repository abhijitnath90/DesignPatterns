package creational.abstractfactory.subfactory;

import creational.abstractfactory.concreteproduct.Phone;

import java.util.Objects;

public class OnePlus {

    private OnePlus() {

    }

    public static Phone getPhone(String model) {
        if(Objects.equals(model, "OnePlus 7"))
            return new Phone("OnePlus 7");
        else if(Objects.equals(model, "OnePlus 8"))
            return new Phone("OnePlus 8");
        return new NullPhone();
    }
}

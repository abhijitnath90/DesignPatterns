package creational.abstractfactory.subfactory;

import creational.abstractfactory.concreteproduct.Phone;

import java.util.Objects;

public class Samsung {

    private Samsung() {
    }

    public static Phone getPhone(String model) {
        if(Objects.equals(model, "s23"))
            return new Phone("s23");
        else if(Objects.equals(model, "s23 ultra"))
            return new Phone("s23 ultra");
        return new NullPhone();
    }
}

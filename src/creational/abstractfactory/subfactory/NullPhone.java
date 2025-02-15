package creational.abstractfactory.subfactory;

import creational.abstractfactory.concreteproduct.Phone;

public class NullPhone extends Phone {

    public NullPhone() {
        super("invalid model");
    }
}

package creational.abstractfactory.superfactory;

import creational.abstractfactory.concreteproduct.Phone;
import creational.abstractfactory.subfactory.Apple;
import creational.abstractfactory.subfactory.NullPhone;
import creational.abstractfactory.subfactory.OnePlus;
import creational.abstractfactory.subfactory.Samsung;

import java.util.Objects;

public class PhoneStore {

    private PhoneStore() {

    }

    public static Phone getPhone(String brand, String model) {
        if(Objects.equals(brand, "Apple"))
            return Apple.getPhone(model);
        else if(Objects.equals(brand, "OnePlus"))
            return OnePlus.getPhone(model);
        else if(Objects.equals(brand, "Samsung"))
            return Samsung.getPhone(model);
        return new NullPhone();
    }

}

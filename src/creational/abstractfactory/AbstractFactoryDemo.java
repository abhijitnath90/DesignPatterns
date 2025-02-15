package creational.abstractfactory;

import creational.abstractfactory.concreteproduct.Phone;
import creational.abstractfactory.superfactory.PhoneStore;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        Phone phone = PhoneStore.getPhone("Apple", "iPhone14");
        phone.getDescription();
        System.out.println();

        Phone phone1 = PhoneStore.getPhone("Apple", "iPhone13");
        phone1.getDescription();
    }
}

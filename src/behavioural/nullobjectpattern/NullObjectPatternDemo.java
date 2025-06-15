package behavioural.nullobjectpattern;

public class NullObjectPatternDemo {

    public static void main(String[] args) {

        Customer customer1 = CustomerFactory.getCustomerById(234);
        System.out.println("Customer with id 234: "+customer1.getName());

        Customer customer2 = CustomerFactory.getCustomerById(123);
        System.out.println("Customer with id 123: " +customer2.getName());

    }
}

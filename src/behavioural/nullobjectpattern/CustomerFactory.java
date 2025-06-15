package behavioural.nullobjectpattern;

public class CustomerFactory {

    public static Customer getCustomerById(int id) {
        if(id == 123) {
            return new RealCustomer("Sachin Tendulkar");
        } else {
            return new NullCustomer();
        }
    }
}

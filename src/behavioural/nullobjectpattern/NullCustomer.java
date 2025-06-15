package behavioural.nullobjectpattern;

public class NullCustomer implements Customer {

    @Override
    public String getName() {
        return "Not Available";
    }
}

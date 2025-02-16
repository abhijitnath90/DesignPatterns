package creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OperatingSystem os = operatingSystemFactory.getInstance("Windows");
        System.out.println(os.getDescription());

    }
}

package creational.factory;

public class OperatingSystemFactory {

    public OperatingSystem getInstance(String type) {
        if(type.equalsIgnoreCase("Android")) {
            return new Android();
        } else if (type.equalsIgnoreCase("IOS")) {
            return new IOS();
        } else if (type.equalsIgnoreCase("Windows")) {
            return new Windows();
        } else {
            return null;
        }
    }
}

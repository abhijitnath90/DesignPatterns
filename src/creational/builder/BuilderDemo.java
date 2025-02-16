package creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        Computer computer = new ComputerBuilder().setOs("Windows").setRam("2 GB").setBattery("6000 mAh").getComputer();
        System.out.println(computer);

    }
}

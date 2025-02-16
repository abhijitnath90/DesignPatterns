package creational.builder;

public class ComputerBuilder {

    private String os;
    private String ram;
    private String processor;
    private String screenSize;
    private String battery;

    public ComputerBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public ComputerBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Computer getComputer() {
        return new Computer(os, ram, processor, screenSize, battery);
    }
}

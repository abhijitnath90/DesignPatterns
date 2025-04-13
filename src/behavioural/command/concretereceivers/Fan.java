package behavioural.command.concretereceivers;

import behavioural.command.receiver.ElectronicDevice;

public class Fan implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Fan is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is OFF.");
    }
}

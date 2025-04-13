package behavioural.command.concretereceivers;

import behavioural.command.receiver.ElectronicDevice;

public class Light implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Light is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is OFF.");
    }
}

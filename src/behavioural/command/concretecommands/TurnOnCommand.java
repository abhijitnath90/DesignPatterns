package behavioural.command.concretecommands;

import behavioural.command.command.Command;
import behavioural.command.receiver.ElectronicDevice;

public class TurnOnCommand implements Command {

    private final ElectronicDevice device;

    public TurnOnCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}

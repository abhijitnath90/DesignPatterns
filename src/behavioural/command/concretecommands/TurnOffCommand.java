package behavioural.command.concretecommands;

import behavioural.command.command.Command;
import behavioural.command.receiver.ElectronicDevice;

public class TurnOffCommand implements Command {

    private final ElectronicDevice device;

    public TurnOffCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}

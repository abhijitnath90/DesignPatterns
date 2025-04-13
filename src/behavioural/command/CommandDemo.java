package behavioural.command;

import behavioural.command.command.Command;
import behavioural.command.concretecommands.TurnOffCommand;
import behavioural.command.concretecommands.TurnOnCommand;
import behavioural.command.concretereceivers.Fan;
import behavioural.command.concretereceivers.Light;
import behavioural.command.invoker.RemoteControl;
import behavioural.command.receiver.ElectronicDevice;

public class CommandDemo {

    public static void main(String[] args) {

        //creating receiver objects
        ElectronicDevice light = new Light();
        ElectronicDevice fan = new Fan();

        //creating command objects
        Command turnOnLight = new TurnOnCommand(light);
        Command turnOffLight = new TurnOffCommand(light);

        Command turnOnFan = new TurnOnCommand(fan);
        Command turnOffFan = new TurnOffCommand(fan);

        //creating invoker object
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnLight);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffLight);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOnFan);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffFan);
        remoteControl.pressButton();
    }
}

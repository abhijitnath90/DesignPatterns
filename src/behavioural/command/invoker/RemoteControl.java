package behavioural.command.invoker;

import behavioural.command.command.Command;

public class RemoteControl {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

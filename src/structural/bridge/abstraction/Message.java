package structural.bridge.abstraction;

import structural.bridge.implementor.MessageSender;

public abstract class Message {

    protected MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send();
}

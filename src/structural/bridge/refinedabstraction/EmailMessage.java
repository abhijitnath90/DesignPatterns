package structural.bridge.refinedabstraction;

import structural.bridge.implementor.MessageSender;
import structural.bridge.abstraction.Message;

public class EmailMessage extends Message {

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}

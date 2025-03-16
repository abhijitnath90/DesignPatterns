package structural.bridge.refinedabstraction;

import structural.bridge.implementor.MessageSender;
import structural.bridge.abstraction.Message;

public class TextMessage extends Message {

    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}

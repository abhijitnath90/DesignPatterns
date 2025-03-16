package structural.bridge.concreteimplementor;

import structural.bridge.implementor.MessageSender;

public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("EmailMessageSender: Sending email message...");
    }
}

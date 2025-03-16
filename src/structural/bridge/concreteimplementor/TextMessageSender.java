package structural.bridge.concreteimplementor;

import structural.bridge.implementor.MessageSender;

public class TextMessageSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("TextMessageSender: Sending text message...");
    }
}

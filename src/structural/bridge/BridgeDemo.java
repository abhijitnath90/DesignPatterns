package structural.bridge;

import structural.bridge.abstraction.Message;
import structural.bridge.concreteimplementor.EmailMessageSender;
import structural.bridge.concreteimplementor.TextMessageSender;
import structural.bridge.implementor.MessageSender;
import structural.bridge.refinedabstraction.EmailMessage;
import structural.bridge.refinedabstraction.TextMessage;

public class BridgeDemo {

    public static void main(String[] args) {

        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();

    }
}

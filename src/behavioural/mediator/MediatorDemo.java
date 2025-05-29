package behavioural.mediator;

import behavioural.mediator.concretecolleague.User;
import behavioural.mediator.concretemediator.ChatMediator;
import behavioural.mediator.mediator.Mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();

        User roger = new User(mediator, "Roger");
        User rafael = new User(mediator, "Rafael");
        User novak = new User(mediator, "Novak");
        User stanislaus = new User(mediator, "Stanislaus");

        mediator.addUser(roger);
        mediator.addUser(rafael);
        mediator.addUser(novak);
        mediator.addUser(stanislaus);

        roger.send("Hello guys. How's everyone?");

    }
}

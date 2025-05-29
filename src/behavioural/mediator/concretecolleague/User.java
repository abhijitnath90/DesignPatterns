package behavioural.mediator.concretecolleague;

import behavioural.mediator.colleague.Colleague;
import behavioural.mediator.mediator.Mediator;

public class User extends Colleague {

    private Mediator mediator;
    private String name;

    public User(Mediator mediator, String name) {
        super(mediator, name);
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println(name+" says "+message);
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name+" receives "+message);
    }
}

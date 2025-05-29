package behavioural.mediator.colleague;

import behavioural.mediator.mediator.Mediator;

public abstract class Colleague {

    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);

}

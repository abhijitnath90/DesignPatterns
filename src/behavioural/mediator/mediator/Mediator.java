package behavioural.mediator.mediator;

import behavioural.mediator.concretecolleague.User;

public interface Mediator {

    void send(String message, User user);

    void addUser(User user);

}

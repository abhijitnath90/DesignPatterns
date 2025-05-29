package behavioural.mediator.concretemediator;

import behavioural.mediator.concretecolleague.User;
import behavioural.mediator.mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {

    private List<User> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void send(String message, User user) {
        for(User u : users) {
            if(!u.getName().equalsIgnoreCase(user.getName())) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}

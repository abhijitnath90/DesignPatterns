package behavioural.memento;

import behavioural.memento.caretaker.Caretaker;
import behavioural.memento.originator.Originator;

public class MementoDemo {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.setSaveToMemento());

        originator.setState("State #3");
        caretaker.add(originator.setSaveToMemento());

        originator.setState("State #4");
        System.out.println("Current State: "+originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First saved state: "+originator.getState());

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Second saved state: "+originator.getState());

    }
}

package behavioural.iterator;

import behavioural.iterator.concreteaggregate.ConcreteAggregate;
import behavioural.iterator.iterator.Iterator;

import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        ConcreteAggregate<String> concreteAggregate = new ConcreteAggregate<>();
        concreteAggregate.add("Roger");
        concreteAggregate.add("Rafael");
        concreteAggregate.add("Novak");
        concreteAggregate.add("Pancho");
        concreteAggregate.add("Sampras");

        Iterator<String> concreteIterator = concreteAggregate.getIterator();
        while(concreteIterator.hasNext()) {
            System.out.println(concreteIterator.next());
        }

    }
}

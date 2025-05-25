package behavioural.iterator.concreteaggregate;

import behavioural.iterator.aggregate.Aggregate;
import behavioural.iterator.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {

    private final List<T> elements;

    public ConcreteAggregate() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    @Override
    public Iterator<T> getIterator() {
        return new ConcreteIterator<T>();
    }

    private class ConcreteIterator<E> implements Iterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < elements.size();
        }

        @Override
        public T next() {
            if(hasNext()) {
                return elements.get(index++);
            }
            return null;
        }
    }
}

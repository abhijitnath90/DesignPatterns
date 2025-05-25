package behavioural.iterator.aggregate;

import behavioural.iterator.iterator.Iterator;

public interface Aggregate<T> {

    Iterator<T> getIterator();
}

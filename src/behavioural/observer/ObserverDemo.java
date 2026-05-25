package behavioural.observer;

import behavioural.observer.concreteobserver.Subscriber;
import behavioural.observer.concretesubject.YouTubeChannel;
import behavioural.observer.observer.Observer;

public class ObserverDemo {

    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("Tech Explained");

        Observer subscriber1 = new Subscriber("Alice");
        Observer subscriber2 = new Subscriber("Bob");

        channel.addObserver(subscriber1);
        channel.addObserver(subscriber2);

        channel.uploadVideo("Observer Pattern in Java");

        channel.removeObserver(subscriber1);

        channel.uploadVideo("Singleton Pattern in Java");
    }
}

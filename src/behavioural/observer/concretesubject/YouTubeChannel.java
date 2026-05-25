package behavioural.observer.concretesubject;

import behavioural.observer.observer.Observer;
import behavioural.observer.subject.Observable;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer: observers) {
            observer.update("New video from " + channelName + ": " + message);
        }
    }

    public void uploadVideo(String title) {
        System.out.println(channelName + " uploaded a new video: " + title);
        notifyObservers(title);
    }
}

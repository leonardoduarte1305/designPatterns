package okhravi.observer.pushpull.implementations;

import okhravi.observer.pushpull.interfaces.Observable;
import okhravi.observer.pushpull.interfaces.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements Observable {

    private final Set<Observer> observers;
    private String message;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::onObservableUpdate);
    }

    public WeatherStation(String message) {
        this.message = message;
        this.observers = new HashSet<>();
    }

    public String getMessage() {
        return message;
    }

    public void modifyMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}

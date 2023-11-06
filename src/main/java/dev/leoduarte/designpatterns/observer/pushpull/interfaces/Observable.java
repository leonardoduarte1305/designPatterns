package dev.leoduarte.designpatterns.observer.pushpull.interfaces;

public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

package dev.leoduarte.designpatterns.behavioral.observer.push.interfaces;

public interface ObservablePush {
    void addObserver(ObserverPush observerPush);

    void removeObserver(ObserverPush observerPush);

    void notifyObservers();
}

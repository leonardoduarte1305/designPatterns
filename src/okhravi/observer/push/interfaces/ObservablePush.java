package okhravi.observer.push.interfaces;

public interface ObservablePush {
    void addObserver(ObserverPush observerPush);

    void removeObserver(ObserverPush observerPush);

    void notifyObservers();
}

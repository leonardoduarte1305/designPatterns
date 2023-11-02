package okhravi.observer.push.implementations;

import okhravi.observer.push.interfaces.ObservablePush;
import okhravi.observer.push.interfaces.ObserverPush;

import java.util.HashSet;
import java.util.Set;

public class SpacialStation implements ObservablePush {

    private final Set<ObserverPush> observersPush;
    private String message;

    @Override
    public void addObserver(ObserverPush observerPush) {
        this.observersPush.add(observerPush);
    }

    @Override
    public void removeObserver(ObserverPush observerPush) {
        this.observersPush.remove(observerPush);
    }

    @Override
    public void notifyObservers() {
        this.observersPush.forEach(
                observer -> observer.onObservableUpdate(this)
        );
    }

    public SpacialStation(String message) {
        this.message = message;
        this.observersPush = new HashSet<>();
    }

    public String getMessage() {
        return message;
    }

    public void modifyMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}

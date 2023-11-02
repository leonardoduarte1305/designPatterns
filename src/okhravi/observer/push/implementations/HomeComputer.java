package okhravi.observer.push.implementations;

import okhravi.observer.push.interfaces.ObservablePush;
import okhravi.observer.push.interfaces.ObserverPush;

public class HomeComputer implements ObserverPush {
    @Override
    public void onObservableUpdate(ObservablePush observablePush) {
        // Here the whole object was PUSHED into this class
        SpacialStation spacialStation = (SpacialStation) observablePush;

        // Here we can access what we need
        String messageToPrint = spacialStation.getMessage();

        String className = this.getClass().getSimpleName().toUpperCase();
        System.out.printf("%s: %s%n", className, messageToPrint);
    }
}

package okhravi.observer.push;

import okhravi.observer.push.implementations.HomeComputer;
import okhravi.observer.push.implementations.SpacialStation;
import okhravi.observer.push.implementations.SuperComputer;

public class ObserverPushTest {

    public static void main(String[] args) {
        // Creating the Observable
        SpacialStation spacialStation = new SpacialStation("First message");

        // Nothing will be done, since we have no Observers yet
        spacialStation.notifyObservers();

        // Creating an Observer
        SuperComputer superComputer = new SuperComputer();
        // Registering the Observer
        spacialStation.addObserver(superComputer);

        // After the message has been updated the notification is sent automatically
        // But, since the SuperComputer did not have access to SpacialStation before
        //      the SuperComputer cannot receive the first message.
        spacialStation.modifyMessage("New message...");

        // Creating another Observer
        HomeComputer homeComputer = new HomeComputer();
        // Registering the new Observer
        spacialStation.addObserver(homeComputer);
        // After the message has been updated the notification is sent automatically
        spacialStation.modifyMessage("Another new message...");

        // Removing Observer
        spacialStation.removeObserver(superComputer);
        // Updating a message after removing one Observer
        spacialStation.modifyMessage("After remove superComputer Observer...");
    }
}
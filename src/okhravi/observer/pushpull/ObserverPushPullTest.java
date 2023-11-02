package okhravi.observer.pushpull;

import okhravi.observer.pushpull.implementations.Fridge;
import okhravi.observer.pushpull.implementations.MobilePhone;
import okhravi.observer.pushpull.implementations.WeatherStation;

public class ObserverPushPullTest {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation("First message");

        // Nothing will be done, we have no Observers yet
        weatherStation.notifyObservers();


        // Creating an Observer
        MobilePhone mobilePhone = new MobilePhone(weatherStation);
        // We can access the first message since the station had been updated
        mobilePhone.onObservableUpdate();

        // Registering the Observer
        weatherStation.addObserver(mobilePhone);
        // After the message has been updated the notification is sent automatically
        weatherStation.modifyMessage("New message...");

        // Creating another Observer
        Fridge fridge = new Fridge(weatherStation);
        // Registering the new Observer
        weatherStation.addObserver(fridge);
        // After the message has been updated the notification is sent automatically
        weatherStation.modifyMessage("Another new message...");

        // Removing Observer
        weatherStation.removeObserver(mobilePhone);
        // Updating a message after removing one Observer
        weatherStation.modifyMessage("After remove mobilePhone Observer...");
    }
}

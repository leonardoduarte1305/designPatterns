package dev.leoduarte.designpatterns.observer.pushpull.implementations;

import dev.leoduarte.designpatterns.observer.pushpull.interfaces.Observer;

public class MobilePhone implements Observer {
    private final WeatherStation weatherStation;

    @Override
    public void onObservableUpdate() {
        // Here, this class is PULLING data at the exact moment it was notified
        String messageToPrint = weatherStation.getMessage();

        String className = this.getClass().getSimpleName().toUpperCase();
        System.out.printf("%s: %s%n", className, messageToPrint);
    }

    public MobilePhone(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
}

package dev.leoduarte.designpatterns.observer.pushpull.implementations;

import dev.leoduarte.designpatterns.observer.pushpull.interfaces.Observer;

public class Fridge implements Observer {
    private final WeatherStation weatherStation;

    @Override
    public void onObservableUpdate() {
        // Here, this class is PULLING data at the exact moment it was notified
        String messageToPrint = weatherStation.getMessage();

        String className = this.getClass().getSimpleName().toUpperCase();
        System.out.printf("%s: %s%n", className, messageToPrint);
    }

    public Fridge(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
}

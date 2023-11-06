package dev.leoduarte.designpatterns.strategy;

import dev.leoduarte.designpatterns.strategy.interfaces.Display;
import dev.leoduarte.designpatterns.strategy.interfaces.Fly;
import dev.leoduarte.designpatterns.strategy.interfaces.Quack;

public class Duck {

    Quack quack;
    Fly fly;
    Display display;

    void executeEverything() {
        this.quack.runQuack();
        this.fly.runFly();
        this.display.runDisplay();
    }

    public Duck(Quack quack, Fly fly, Display display) {
        this.quack = quack;
        this.fly = fly;
        this.display = display;
    }
}

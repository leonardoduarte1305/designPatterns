package dev.leoduarte.designpatterns.behavioral.strategy.implementations;

import dev.leoduarte.designpatterns.behavioral.strategy.interfaces.Display;
import dev.leoduarte.designpatterns.behavioral.strategy.interfaces.Fly;
import dev.leoduarte.designpatterns.behavioral.strategy.interfaces.Quack;
import lombok.Getter;

@Getter
public class Duck {

    Quack quack;
    Fly fly;
    Display display;

    public void executeEverything() {
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

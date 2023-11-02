package okhravi.strategy;

import okhravi.strategy.interfaces.Display;
import okhravi.strategy.interfaces.Fly;
import okhravi.strategy.interfaces.Quack;

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

package dev.leoduarte.designpatterns.behavioral.strategy;

import dev.leoduarte.designpatterns.behavioral.strategy.implementations.Duck;
import dev.leoduarte.designpatterns.behavioral.strategy.implementations.fly.JetFly;
import dev.leoduarte.designpatterns.behavioral.strategy.implementations.fly.NoFly;
import dev.leoduarte.designpatterns.behavioral.strategy.implementations.fly.SimpleFly;
import dev.leoduarte.designpatterns.behavioral.strategy.implementations.quack.LoudQuack;
import dev.leoduarte.designpatterns.behavioral.strategy.implementations.quack.NoQuack;
import dev.leoduarte.designpatterns.behavioral.strategy.implementations.quack.SimpleQuack;
import dev.leoduarte.designpatterns.behavioral.strategy.interfaces.Display;
import dev.leoduarte.designpatterns.behavioral.strategy.interfaces.Fly;
import dev.leoduarte.designpatterns.behavioral.strategy.interfaces.Quack;
import dev.leoduarte.designpatterns.behavioral.strategy.implementations.display.GraphicDisplay;
import dev.leoduarte.designpatterns.behavioral.strategy.implementations.display.TextDisplay;

public class DuckTest {

    public static void main(String[] args) {

        // Youtube Video
        // https://youtu.be/v9ejT8FO-7I?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc

        Quack loudQuack = new LoudQuack();
        Fly jetFly = new JetFly();
        Display graphicDisplay = new GraphicDisplay();

        Duck freneticDuck = new Duck(loudQuack, jetFly, graphicDisplay);

        System.out.println("*** Frenetic Duck ***");
        freneticDuck.getQuack().runQuack();
        freneticDuck.getFly().runFly();
        freneticDuck.getDisplay().runDisplay();

        System.out.println("==================================");

        Quack noQuack = new NoQuack();
        Fly noFly = new NoFly();
        Display textDisplay = new TextDisplay();

        Duck rubberDuck = new Duck(noQuack, noFly, textDisplay);

        System.out.println("*** Rubber Duck ***");
        rubberDuck.getQuack().runQuack();
        rubberDuck.getFly().runFly();
        rubberDuck.getDisplay().runDisplay();

        System.out.println("==================================");

        Quack simpleQuack = new SimpleQuack();
        Fly simpleFly = new SimpleFly();

        Duck simpleDuck = new Duck(simpleQuack, simpleFly, textDisplay);

        System.out.println("*** Simple Duck ***");
        simpleDuck.executeEverything();
    }
}

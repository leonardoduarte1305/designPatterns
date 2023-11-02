package okhravi.strategy;

import okhravi.strategy.implementations.display.GraphicDisplay;
import okhravi.strategy.implementations.display.TextDisplay;
import okhravi.strategy.implementations.fly.JetFly;
import okhravi.strategy.implementations.fly.NoFly;
import okhravi.strategy.implementations.fly.SimpleFly;
import okhravi.strategy.implementations.quack.LoudQuack;
import okhravi.strategy.implementations.quack.NoQuack;
import okhravi.strategy.implementations.quack.SimpleQuack;
import okhravi.strategy.interfaces.Display;
import okhravi.strategy.interfaces.Fly;
import okhravi.strategy.interfaces.Quack;

public class DuckTest {

    public static void main(String[] args) {

        // Youtube Video
        // https://youtu.be/v9ejT8FO-7I?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc

        Quack loudQuack = new LoudQuack();
        Fly jetFly = new JetFly();
        Display graphicDisplay = new GraphicDisplay();

        Duck freneticDuck = new Duck(loudQuack, jetFly, graphicDisplay);

        System.out.println("*** Frenetic Duck ***");
        freneticDuck.quack.runQuack();
        freneticDuck.fly.runFly();
        freneticDuck.display.runDisplay();

        System.out.println("==================================");

        Quack noQuack = new NoQuack();
        Fly noFly = new NoFly();
        Display textDisplay = new TextDisplay();

        Duck rubberDuck = new Duck(noQuack, noFly, textDisplay);

        System.out.println("*** Rubber Duck ***");
        rubberDuck.quack.runQuack();
        rubberDuck.fly.runFly();
        rubberDuck.display.runDisplay();

        System.out.println("==================================");

        Quack simpleQuack = new SimpleQuack();
        Fly simpleFly = new SimpleFly();

        Duck simpleDuck = new Duck(simpleQuack, simpleFly, textDisplay);

        System.out.println("*** Simple Duck ***");
        simpleDuck.executeEverything();
    }
}

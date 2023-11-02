package okhravi.strategy.implementations.fly;

import okhravi.strategy.interfaces.Fly;

public class SimpleFly implements Fly {
    @Override
    public void runFly() {
        System.out.println("Simple fly!");
    }
}

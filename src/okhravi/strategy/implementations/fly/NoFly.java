package okhravi.strategy.implementations.fly;

import okhravi.strategy.interfaces.Fly;

public class NoFly implements Fly {
    @Override
    public void runFly() {
        System.out.println("No fly.");
    }
}

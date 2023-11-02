package okhravi.strategy.implementations.quack;

import okhravi.strategy.interfaces.Quack;

public class NoQuack implements Quack {
    @Override
    public void runQuack() {
        System.out.println("No quack.");
    }
}

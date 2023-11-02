package okhravi.strategy.implementations.quack;

import okhravi.strategy.interfaces.Quack;

public class SimpleQuack implements Quack {
    @Override
    public void runQuack() {
        System.out.println("Simple quack!");
    }
}

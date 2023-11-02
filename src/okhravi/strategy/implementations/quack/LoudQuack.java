package okhravi.strategy.implementations.quack;

import okhravi.strategy.interfaces.Quack;

public class LoudQuack implements Quack {
    @Override
    public void runQuack() {
        System.out.println("Loud quack!!!!");
    }
}

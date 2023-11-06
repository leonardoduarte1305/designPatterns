package dev.leoduarte.designpatterns.strategy.implementations.fly;

import dev.leoduarte.designpatterns.strategy.interfaces.Fly;

public class NoFly implements Fly {
    @Override
    public void runFly() {
        System.out.println("No fly.");
    }
}

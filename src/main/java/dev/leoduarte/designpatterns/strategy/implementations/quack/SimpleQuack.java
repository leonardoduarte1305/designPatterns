package dev.leoduarte.designpatterns.strategy.implementations.quack;

import dev.leoduarte.designpatterns.strategy.interfaces.Quack;

public class SimpleQuack implements Quack {
    @Override
    public void runQuack() {
        System.out.println("Simple quack!");
    }
}

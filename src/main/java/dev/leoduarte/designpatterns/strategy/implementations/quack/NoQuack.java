package dev.leoduarte.designpatterns.strategy.implementations.quack;

import dev.leoduarte.designpatterns.strategy.interfaces.Quack;

public class NoQuack implements Quack {
    @Override
    public void runQuack() {
        System.out.println("No quack.");
    }
}

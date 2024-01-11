package dev.leoduarte.designpatterns.behavioral.strategy.implementations.quack;

import dev.leoduarte.designpatterns.behavioral.strategy.interfaces.Quack;

public class NoQuack implements Quack {
    @Override
    public void runQuack() {
        System.out.println("No quack.");
    }
}

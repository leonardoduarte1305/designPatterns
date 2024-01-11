package dev.leoduarte.designpatterns.behavioral.strategy.implementations.fly;

import dev.leoduarte.designpatterns.behavioral.strategy.interfaces.Fly;

public class JetFly implements Fly {
    @Override
    public void runFly() {
        System.out.println("Jet fly!!!");
    }
}

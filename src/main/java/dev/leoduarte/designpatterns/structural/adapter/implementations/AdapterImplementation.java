package dev.leoduarte.designpatterns.structural.adapter.implementations;

import dev.leoduarte.designpatterns.structural.adapter.interfaces.OriginalInterface;

public class AdapterImplementation implements OriginalInterface {
    private final Adaptee adaptee;

    @Override
    public void request(String className) {
        this.adaptee.specificPrint(className);
    }

    public AdapterImplementation(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}

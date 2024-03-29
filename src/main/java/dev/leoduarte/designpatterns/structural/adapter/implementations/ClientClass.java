package dev.leoduarte.designpatterns.structural.adapter.implementations;

import dev.leoduarte.designpatterns.structural.adapter.interfaces.OriginalInterface;

public class ClientClass {
    private final OriginalInterface originalInterface;

    public ClientClass(OriginalInterface originalInterface) {
        this.originalInterface = originalInterface;
    }

    public void printClassName(String className) {
        this.originalInterface.request(className);
    }
}

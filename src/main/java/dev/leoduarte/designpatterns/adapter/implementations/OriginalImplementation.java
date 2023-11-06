package dev.leoduarte.designpatterns.adapter.implementations;

import dev.leoduarte.designpatterns.adapter.interfaces.OriginalInterface;

public class OriginalImplementation implements OriginalInterface {
    @Override
    public void request(String className) {
        System.out.printf("ClassName: %s\n", this.getClass().getSimpleName());
    }
}

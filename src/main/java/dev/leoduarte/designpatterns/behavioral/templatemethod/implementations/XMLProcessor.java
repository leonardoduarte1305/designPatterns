package dev.leoduarte.designpatterns.behavioral.templatemethod.implementations;

import dev.leoduarte.designpatterns.behavioral.templatemethod.abstractions.DataProcessor;

public class XMLProcessor extends DataProcessor {

    @Override
    public void openFile() {
        System.out.println("Esta implementação de openFile() pertence á classe: " + this.getClass().getSimpleName());
    }

    @Override
    public void readData() {
        System.out.println("Esta implementação de readData() pertence á classe: " + this.getClass().getSimpleName());
    }

    @Override
    public void parseData() {
        System.out.println("Esta implementação de parseData() pertence á classe: " + this.getClass().getSimpleName());
    }

    @Override
    public void closeFile() {
        System.out.println("Esta implementação de closeFile() pertence á classe: " + this.getClass().getSimpleName());
    }

    @Override
    public void printTheContentAsString() {
        System.out.println("Esta implementação de printTheContentAsString() pertence á classe: " + this.getClass().getSimpleName());
    }
}

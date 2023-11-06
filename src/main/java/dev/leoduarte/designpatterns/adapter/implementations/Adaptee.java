package dev.leoduarte.designpatterns.adapter.implementations;

public class Adaptee {
    public void specificPrint(String clazzName) {
        System.out.println("This is a replacement for the original method.");
    }
}

package dev.leoduarte.designpatterns.behavioral.chainofresponsibility.interfaces;

public interface Handler {
    boolean handle(String username, String password);
}

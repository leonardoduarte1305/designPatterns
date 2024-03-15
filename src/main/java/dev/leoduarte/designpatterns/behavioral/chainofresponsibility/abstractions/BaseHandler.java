package dev.leoduarte.designpatterns.behavioral.chainofresponsibility.abstractions;

import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.interfaces.Handler;

public abstract class BaseHandler implements Handler {
    private Handler nextHandler;

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    protected boolean handleNext(String username, String password) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.handle(username, password);
    }
}

package dev.leoduarte.designpatterns.behavioral.chainofresponsibility.implementations;

import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.Database;
import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.abstractions.BaseHandler;
import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.interfaces.Handler;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ValidPasswordHandler extends BaseHandler {
    private final Database database;

    @Override
    public boolean handle(String username, String password) {
        System.err.println("======= " + this.getClass().getSimpleName());
        if (!database.isValidPassword(username, password)) {
            System.err.println("Wrong password.");
            return false;
        }
        return handleNext(username, password);
    }
}

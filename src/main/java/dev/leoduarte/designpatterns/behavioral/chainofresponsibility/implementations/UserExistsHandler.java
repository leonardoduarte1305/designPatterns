package dev.leoduarte.designpatterns.behavioral.chainofresponsibility.implementations;

import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.Database;
import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.abstractions.BaseHandler;
import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.interfaces.Handler;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserExistsHandler extends BaseHandler {
    private final Database database;

    @Override
    public boolean handle(String username, String password) {
        System.err.println("======= " + this.getClass().getSimpleName());
        if (!database.isValidUser(username)) {
            System.err.println("This username is not registered.");
            System.err.println("Sign up to our app right now!");
            return false;
        }
        return handleNext(username, password);
    }
}

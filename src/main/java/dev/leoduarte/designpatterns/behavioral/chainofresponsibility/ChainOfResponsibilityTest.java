package dev.leoduarte.designpatterns.behavioral.chainofresponsibility;

import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.abstractions.BaseHandler;
import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.implementations.RoleCheckHandler;
import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.implementations.UserExistsHandler;
import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.implementations.ValidPasswordHandler;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Database database = new Database();

        BaseHandler firstHandler = new UserExistsHandler(database);
        BaseHandler secondHandler = new ValidPasswordHandler(database);
        BaseHandler thirdHandler = new RoleCheckHandler(database);

        firstHandler.setNextHandler(secondHandler);
        secondHandler.setNextHandler(thirdHandler);
        thirdHandler.setNextHandler(null);

        AuthService authService = new AuthService(firstHandler);
        authService.logIn("admin_username", "admin_password");
    }
}

package dev.leoduarte.designpatterns.behavioral.chainofresponsibility;

import dev.leoduarte.designpatterns.behavioral.chainofresponsibility.interfaces.Handler;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthService {
    private final Handler handler;

    public boolean logIn(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("Authozization was successful!");

            // Do stuffs for authorized users

            return true;
        }
        return false;
    }
}

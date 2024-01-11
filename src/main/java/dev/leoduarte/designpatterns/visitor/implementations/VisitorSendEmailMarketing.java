package dev.leoduarte.designpatterns.visitor.implementations;

import dev.leoduarte.designpatterns.visitor.interfaces.Visitor;

public class VisitorSendEmailMarketing implements Visitor {
    @Override
    public void sendItTo(CustomerA customer) {
        System.out.println("Sending an Email Marketing to: " + customer.toString());
    }

    @Override
    public void sendItTo(CustomerB customer) {
        System.out.println("Sending an Email Marketing to: " + customer.toString());
    }

    @Override
    public void sendItTo(CustomerC customer) {
        System.out.println("Sending an Email Marketing to: " + customer.toString());
    }
}

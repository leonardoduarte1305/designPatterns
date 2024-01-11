package dev.leoduarte.designpatterns.behavioral.visitor.interfaces;

public interface VisitableCustomer {

    void acceptVisitor(Visitor visitor);
}

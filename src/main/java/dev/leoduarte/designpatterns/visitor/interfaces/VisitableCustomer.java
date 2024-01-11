package dev.leoduarte.designpatterns.visitor.interfaces;

public interface VisitableCustomer {

    void acceptVisitor(Visitor visitor);
}

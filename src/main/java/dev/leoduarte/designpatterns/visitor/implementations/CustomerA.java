package dev.leoduarte.designpatterns.visitor.implementations;

import dev.leoduarte.designpatterns.visitor.abstractions.Customer;
import dev.leoduarte.designpatterns.visitor.interfaces.VisitableCustomer;
import dev.leoduarte.designpatterns.visitor.interfaces.Visitor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class CustomerA extends Customer implements VisitableCustomer {

    private String onlyCustomerAProperty;

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.sendItTo(this);
    }

    @Override
    public String toString() {
        return "CustomerA{" +
                "onlyCustomerAProperty='" + onlyCustomerAProperty + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

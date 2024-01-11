package dev.leoduarte.designpatterns.visitor.implementations;

import dev.leoduarte.designpatterns.visitor.abstractions.Customer;
import dev.leoduarte.designpatterns.visitor.interfaces.VisitableCustomer;
import dev.leoduarte.designpatterns.visitor.interfaces.Visitor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class CustomerB extends Customer implements VisitableCustomer {

    private String onlyCustomerBProperty;

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.sendItTo(this);
    }

    @Override
    public String toString() {
        return "CustomerB{" +
                "onlyCustomerBProperty='" + onlyCustomerBProperty + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

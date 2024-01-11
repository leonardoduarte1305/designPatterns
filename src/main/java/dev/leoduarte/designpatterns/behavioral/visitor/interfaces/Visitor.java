package dev.leoduarte.designpatterns.behavioral.visitor.interfaces;

import dev.leoduarte.designpatterns.behavioral.visitor.implementations.CustomerA;
import dev.leoduarte.designpatterns.behavioral.visitor.implementations.CustomerB;
import dev.leoduarte.designpatterns.behavioral.visitor.implementations.CustomerC;

public interface Visitor {

    void sendItTo(CustomerA customer);

    void sendItTo(CustomerB customer);

    void sendItTo(CustomerC customer);
}

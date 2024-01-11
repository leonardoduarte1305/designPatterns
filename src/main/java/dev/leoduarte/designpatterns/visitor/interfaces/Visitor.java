package dev.leoduarte.designpatterns.visitor.interfaces;

import dev.leoduarte.designpatterns.visitor.implementations.CustomerA;
import dev.leoduarte.designpatterns.visitor.implementations.CustomerB;
import dev.leoduarte.designpatterns.visitor.implementations.CustomerC;

public interface Visitor {

    void sendItTo(CustomerA customer);

    void sendItTo(CustomerB customer);

    void sendItTo(CustomerC customer);
}

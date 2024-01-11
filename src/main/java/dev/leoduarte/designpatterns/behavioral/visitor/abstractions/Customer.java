package dev.leoduarte.designpatterns.behavioral.visitor.abstractions;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public abstract class Customer {

    protected String name;
    protected String lastName;
}

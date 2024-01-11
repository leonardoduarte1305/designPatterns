package dev.leoduarte.designpatterns.visitor.abstractions;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public abstract class Customer {

    protected String name;
    protected String lastName;
}

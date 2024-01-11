package dev.leoduarte.designpatterns.structural.decorator.abstractions;

import java.math.BigDecimal;

public abstract class BeverageComponent {
    public abstract String getDescription();

    public abstract BigDecimal getCost();
}

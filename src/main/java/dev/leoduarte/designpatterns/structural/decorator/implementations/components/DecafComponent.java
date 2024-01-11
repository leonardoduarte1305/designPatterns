package dev.leoduarte.designpatterns.structural.decorator.implementations.components;

import dev.leoduarte.designpatterns.structural.decorator.abstractions.BeverageComponent;

import java.math.BigDecimal;

public class DecafComponent extends BeverageComponent {

    @Override
    public String getDescription() {
        return "Decaf Coffee";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("1.50");
    }
}

package dev.leoduarte.designpatterns.structural.decorator.implementations.components;

import dev.leoduarte.designpatterns.structural.decorator.abstractions.BeverageComponent;

import java.math.BigDecimal;

public class EspressoComponent extends BeverageComponent {
    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("2.00");
    }
}

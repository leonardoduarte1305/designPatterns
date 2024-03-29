package dev.leoduarte.designpatterns.structural.decorator.implementations.addons;

import dev.leoduarte.designpatterns.structural.decorator.abstractions.AddOnDecorator;
import dev.leoduarte.designpatterns.structural.decorator.abstractions.BeverageComponent;

import java.math.BigDecimal;

public class CaramelAddOn extends AddOnDecorator {
    @Override
    public String getDescription() {
        return this.beverageComponent.getDescription() + " with Caramel AddOn";
    }

    @Override
    public BigDecimal getCost() {
        return beverageComponent.getCost().add(new BigDecimal("2.25"));
    }

    public CaramelAddOn(BeverageComponent beverageComponent) {
        super(beverageComponent);
    }
}

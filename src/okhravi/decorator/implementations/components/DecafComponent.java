package okhravi.decorator.implementations.components;

import okhravi.decorator.abstractions.BeverageComponent;

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
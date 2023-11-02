package okhravi.decorator.implementations;

import okhravi.decorator.abstractions.AddOnDecorator;
import okhravi.decorator.abstractions.BeverageComponent;

import java.math.BigDecimal;

public class SoyMilkAddOn extends AddOnDecorator {
    @Override
    public String getDescription() {
        return this.beverageComponent.getDescription() + "with SoyMilk AddOn";
    }

    @Override
    public BigDecimal getCost() {
        return beverageComponent.getCost().add(new BigDecimal("3.50"));
    }

    public SoyMilkAddOn(BeverageComponent beverageComponent) {
        super(beverageComponent);
    }
}

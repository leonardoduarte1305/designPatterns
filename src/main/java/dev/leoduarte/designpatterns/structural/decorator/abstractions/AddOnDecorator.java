package dev.leoduarte.designpatterns.structural.decorator.abstractions;

public abstract class AddOnDecorator extends BeverageComponent {
    protected final BeverageComponent beverageComponent;

    public AddOnDecorator(BeverageComponent beverageComponent) {
        this.beverageComponent = beverageComponent;
    }
}

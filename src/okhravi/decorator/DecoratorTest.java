package okhravi.decorator;

import okhravi.decorator.implementations.CaramelAddOn;
import okhravi.decorator.implementations.DecafComponent;
import okhravi.decorator.implementations.SoyMilkAddOn;

public class DecoratorTest {

    public static void main(String[] args) {
        // Creating the base component to decorate
        DecafComponent decaf = new DecafComponent();

        // Decorating with Caramel
        CaramelAddOn decafWithCaramel = new CaramelAddOn(decaf);

        // 1 Component + 1 Decorator
        System.out.printf("%s: \nPrice: %s\n",
                decafWithCaramel.getDescription(),
                decafWithCaramel.getCost().toPlainString());

        // Decorating with SoyMilk
        SoyMilkAddOn soyMilkAddOn = new SoyMilkAddOn(decafWithCaramel);

        // 1 Component + 2 Decorator
        System.out.printf("%s: \nPrice: %s\n",
                soyMilkAddOn.getDescription(),
                soyMilkAddOn.getCost().toPlainString());
    }
}

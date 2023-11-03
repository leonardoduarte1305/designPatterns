package okhravi.decorator;

import okhravi.decorator.implementations.addons.CaramelAddOn;
import okhravi.decorator.implementations.addons.SoyMilkAddOn;
import okhravi.decorator.implementations.components.DecafComponent;

public class DecoratorTest {

    // Youtube Video
    // https://youtu.be/GCraGHx6gso?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc
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

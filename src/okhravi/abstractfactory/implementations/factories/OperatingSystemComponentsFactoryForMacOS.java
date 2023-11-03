package okhravi.abstractfactory.implementations.factories;

import okhravi.abstractfactory.abstractions.Component;
import okhravi.abstractfactory.abstractions.OperatingSystemComponentsFactory;
import okhravi.abstractfactory.implementations.components.macos.ComponentAlertMacOS;
import okhravi.abstractfactory.implementations.components.macos.ComponentButtonMacOS;
import okhravi.abstractfactory.implementations.components.macos.ComponentTextMacOS;
import okhravi.abstractfactory.implementations.components.macos.ComponentWindowMacOS;

public class OperatingSystemComponentsFactoryForMacOS implements OperatingSystemComponentsFactory {
    @Override
    public Component createComponentA() {
        return new ComponentAlertMacOS();
    }

    @Override
    public Component createComponentB() {
        return new ComponentButtonMacOS();
    }

    @Override
    public Component createComponentC() {
        return new ComponentTextMacOS();
    }

    @Override
    public Component createComponentD() {
        return new ComponentWindowMacOS();
    }
}

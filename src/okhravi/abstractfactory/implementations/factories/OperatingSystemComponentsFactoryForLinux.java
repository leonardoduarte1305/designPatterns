package okhravi.abstractfactory.implementations.factories;

import okhravi.abstractfactory.implementations.components.linux.ComponentAlertLinux;
import okhravi.abstractfactory.implementations.components.linux.ComponentButtonLinux;
import okhravi.abstractfactory.implementations.components.linux.ComponentTextLinux;
import okhravi.abstractfactory.implementations.components.linux.ComponentWindowLinux;
import okhravi.abstractfactory.interfaces.Component;
import okhravi.abstractfactory.interfaces.OperatingSystemComponentsFactory;

public class OperatingSystemComponentsFactoryForLinux implements OperatingSystemComponentsFactory {
    @Override
    public Component createComponentA() {
        return new ComponentAlertLinux();
    }

    @Override
    public Component createComponentB() {
        return new ComponentButtonLinux();
    }

    @Override
    public Component createComponentC() {
        return new ComponentTextLinux();
    }

    @Override
    public Component createComponentD() {
        return new ComponentWindowLinux();
    }
}

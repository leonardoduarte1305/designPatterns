package okhravi.abstractfactory.implementations.factories;

import okhravi.abstractfactory.implementations.components.windows.ComponentAlertWindows;
import okhravi.abstractfactory.implementations.components.windows.ComponentButtonWindows;
import okhravi.abstractfactory.implementations.components.windows.ComponentTextWindows;
import okhravi.abstractfactory.implementations.components.windows.ComponentWindowWindows;
import okhravi.abstractfactory.interfaces.Component;
import okhravi.abstractfactory.interfaces.OperatingSystemComponentsFactory;

public class OperatingSystemComponentsFactoryForWindows implements OperatingSystemComponentsFactory {
    @Override
    public Component createComponentA() {
        return new ComponentAlertWindows();
    }

    @Override
    public Component createComponentB() {
        return new ComponentButtonWindows();
    }

    @Override
    public Component createComponentC() {
        return new ComponentTextWindows();
    }

    @Override
    public Component createComponentD() {
        return new ComponentWindowWindows();
    }
}

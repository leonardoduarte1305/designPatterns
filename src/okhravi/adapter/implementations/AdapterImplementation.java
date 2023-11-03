package okhravi.adapter.implementations;

import okhravi.adapter.interfaces.OriginalInterface;

public class AdapterImplementation implements OriginalInterface {
    private final Adaptee adaptee;

    @Override
    public void request(String className) {
        this.adaptee.specificPrint(className);
    }

    public AdapterImplementation(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}

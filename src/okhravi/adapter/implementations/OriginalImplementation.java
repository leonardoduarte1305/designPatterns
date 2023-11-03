package okhravi.adapter.implementations;

import okhravi.adapter.interfaces.OriginalInterface;

public class OriginalImplementation implements OriginalInterface {
    @Override
    public void request(String className) {
        System.out.printf("ClassName: %s\n", this.getClass().getSimpleName());
    }
}

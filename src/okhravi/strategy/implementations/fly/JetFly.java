package okhravi.strategy.implementations.fly;

import okhravi.strategy.interfaces.Fly;

public class JetFly implements Fly {
    @Override
    public void runFly() {
        System.out.println("Jet fly!!!");
    }
}

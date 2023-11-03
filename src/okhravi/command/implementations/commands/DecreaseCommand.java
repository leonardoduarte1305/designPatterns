package okhravi.command.implementations.commands;

import okhravi.command.implementations.receiver.Lamp;
import okhravi.command.interfaces.Command;

public class DecreaseCommand implements Command {
    private final Lamp lamp;

    public DecreaseCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.decreaseBrightness();
    }

    @Override
    public void unExecute() {
        lamp.increaseBrightness();
    }
}

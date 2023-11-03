package okhravi.command.implementations.commands;

import okhravi.command.implementations.receiver.Lamp;
import okhravi.command.interfaces.Command;

public class IncreaseCommand implements Command {
    private final Lamp lamp;

    public IncreaseCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.increaseBrightness();
    }

    @Override
    public void unExecute() {
        lamp.decreaseBrightness();
    }
}

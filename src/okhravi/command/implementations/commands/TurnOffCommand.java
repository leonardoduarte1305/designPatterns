package okhravi.command.implementations.commands;

import okhravi.command.implementations.receiver.Lamp;
import okhravi.command.interfaces.Command;

public class TurnOffCommand implements Command {
    private final Lamp lamp;

    public TurnOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOff();
    }

    @Override
    public void unExecute() {
        lamp.turnOn();
    }
}

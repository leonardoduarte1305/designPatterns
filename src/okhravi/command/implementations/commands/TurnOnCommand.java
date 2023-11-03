package okhravi.command.implementations.commands;

import okhravi.command.implementations.receiver.Lamp;
import okhravi.command.interfaces.Command;

public class TurnOnCommand implements Command {
    private final Lamp lamp;

    public TurnOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }

    @Override
    public void unExecute() {
        lamp.turnOff();
    }
}

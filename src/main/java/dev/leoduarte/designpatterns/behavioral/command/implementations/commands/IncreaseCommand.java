package dev.leoduarte.designpatterns.behavioral.command.implementations.commands;

import dev.leoduarte.designpatterns.behavioral.command.implementations.receiver.Lamp;
import dev.leoduarte.designpatterns.behavioral.command.interfaces.Command;

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

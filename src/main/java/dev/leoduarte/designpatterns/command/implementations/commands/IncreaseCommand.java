package dev.leoduarte.designpatterns.command.implementations.commands;

import dev.leoduarte.designpatterns.command.implementations.receiver.Lamp;
import dev.leoduarte.designpatterns.command.interfaces.Command;

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

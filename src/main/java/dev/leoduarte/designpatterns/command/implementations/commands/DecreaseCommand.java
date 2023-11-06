package dev.leoduarte.designpatterns.command.implementations.commands;

import dev.leoduarte.designpatterns.command.implementations.receiver.Lamp;
import dev.leoduarte.designpatterns.command.interfaces.Command;

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

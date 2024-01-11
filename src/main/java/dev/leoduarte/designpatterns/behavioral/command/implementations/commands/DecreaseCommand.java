package dev.leoduarte.designpatterns.behavioral.command.implementations.commands;

import dev.leoduarte.designpatterns.behavioral.command.implementations.receiver.Lamp;
import dev.leoduarte.designpatterns.behavioral.command.interfaces.Command;

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

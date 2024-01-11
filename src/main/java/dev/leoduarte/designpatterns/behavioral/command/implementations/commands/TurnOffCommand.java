package dev.leoduarte.designpatterns.behavioral.command.implementations.commands;

import dev.leoduarte.designpatterns.behavioral.command.implementations.receiver.Lamp;
import dev.leoduarte.designpatterns.behavioral.command.interfaces.Command;

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

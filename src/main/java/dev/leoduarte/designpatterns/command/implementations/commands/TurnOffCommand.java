package dev.leoduarte.designpatterns.command.implementations.commands;

import dev.leoduarte.designpatterns.command.implementations.receiver.Lamp;
import dev.leoduarte.designpatterns.command.interfaces.Command;

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

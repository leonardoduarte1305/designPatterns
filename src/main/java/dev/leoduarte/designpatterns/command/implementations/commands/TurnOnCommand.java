package dev.leoduarte.designpatterns.command.implementations.commands;

import dev.leoduarte.designpatterns.command.implementations.receiver.Lamp;
import dev.leoduarte.designpatterns.command.interfaces.Command;

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

package dev.leoduarte.designpatterns.behavioral.command.implementations.commands;

import dev.leoduarte.designpatterns.behavioral.command.implementations.receiver.Lamp;
import dev.leoduarte.designpatterns.behavioral.command.interfaces.Command;

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

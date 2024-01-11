package dev.leoduarte.designpatterns.behavioral.command.implementations.invoker;

import dev.leoduarte.designpatterns.behavioral.command.interfaces.Command;

public class FourButtonsController {
    private final Command on;
    private final Command off;
    private final Command up;
    private final Command down;

    public FourButtonsController(Command on,
                                 Command off,
                                 Command up,
                                 Command down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void whenPressingOn() {
        on.execute();
    }

    public void whenPressingOff() {
        off.execute();
    }

    public void whenPressingUp() {
        up.execute();
    }

    public void whenPressingDown() {
        down.execute();
    }
}

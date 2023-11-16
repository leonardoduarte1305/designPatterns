package dev.leoduarte.designpatterns.composite.implementations;

import dev.leoduarte.designpatterns.composite.interfaces.Component;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Leaf implements Component {

    private final String leafName;
    private final Integer number;

    @Override
    public String executeAndReturnName() {
        return "  " + leafName;
    }

    @Override
    public String calculate() {
        return number.toString();
    }
}

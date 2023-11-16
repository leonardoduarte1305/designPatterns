package dev.leoduarte.designpatterns.composite.implementations;

import dev.leoduarte.designpatterns.composite.interfaces.Component;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class Composite implements Component {

    private final String compositName;
    private final List<Component> children;
    private final String operator;

    @Override
    public String executeAndReturnName() {
        StringBuilder paraRetornar = new StringBuilder();
        paraRetornar.append(compositName).append("\n");

        children.forEach(child ->
                paraRetornar.append("  ")
                        .append(child.executeAndReturnName())
                        .append("\n")
        );
        return paraRetornar.toString();
    }

    @Override
    public String calculate() {
        StringBuilder result = new StringBuilder();
        children.forEach(child -> result.append(child.calculate()).append(operator));
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}

package dev.leoduarte.streams.auxiliary;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

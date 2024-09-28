package dev.leoduarte.streams.auxiliary;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {

    private final String name;
    private final Category category;

    public enum Category {
        BEER, VODKA, ENERGETIC, WINE, CACHACA
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", category=" + category + "]";
    }
}

package dev.leoduarte.streams.auxiliary;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product {

    @EqualsAndHashCode.Include
    private final String name;

    private final Category category;
    private final BigDecimal price;

    public enum Category {
        BEER, VODKA, ENERGETIC, WINE, CACHACA
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", category=" + category + "]";
    }
}

package dev.leoduarte.streams.auxiliary;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Seller {

    @EqualsAndHashCode.Include
    private final String name;
    private final List<AnotherOrder> orders;

    @Override
    public String toString() {
        return "Seller [name=" + name + ", orders=" + getTotalOfOrders() + "]";
    }

    private int getTotalOfOrders() {
        return orders.size();
    }

}

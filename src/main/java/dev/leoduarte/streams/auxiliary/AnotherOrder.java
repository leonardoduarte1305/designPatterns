package dev.leoduarte.streams.auxiliary;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@AllArgsConstructor
public class AnotherOrder {

    private final List<ProductAndQuantity> products;

    public BigDecimal getTotal() {
        return products.stream()
                .map(ProductAndQuantity::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}

package dev.leoduarte.streams.auxiliary;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class ProductAndQuantity {

    private final Product product;
    private final Integer quantity;

    public BigDecimal getPrice() {
        return product.getPrice().multiply(new BigDecimal(quantity));
    }

}

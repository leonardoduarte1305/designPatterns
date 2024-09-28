package dev.leoduarte.streams.auxiliary;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Transaction {

    private TransactionType type;
    private BigDecimal amount;

    @Override
    public String toString() {
        return "Transaction [type=" + type + ", amount=" + amount + "]";
    }

    public enum TransactionType {
        SELL, BUY;
    }
}

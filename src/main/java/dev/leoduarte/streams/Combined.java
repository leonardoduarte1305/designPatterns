package dev.leoduarte.streams;

import dev.leoduarte.streams.auxiliary.Order;
import dev.leoduarte.streams.auxiliary.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import static dev.leoduarte.streams.auxiliary.Constants.ORDERS;

public class Combined {

    public static void main(String[] args) {

        // Given a list of Orders, where each order contains a list of items and the total order value, calculate:
        // The total value of all orders.
        // The number of orders with a value greater than R$ 100.
        // A list of items purchased by all customers (no duplicates).
        final BigDecimal valueOfAllOrders = ORDERS.stream()
                .map(Order::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("valueOfAllOrders = " + valueOfAllOrders);

        final long numberOfOrdersValueGreaterThan100 = ORDERS.stream()
                .map(Order::getTotal)
                .filter(total -> total.compareTo(new BigDecimal(100)) > 0)
                .count();
        System.out.println("numberOfOrdersValueGreaterThan100 = " + numberOfOrdersValueGreaterThan100);

        final List<Product> listOfItemsBoughtByAllCustomers = ORDERS.stream()
                .map(Order::getProducts)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("listOfItemsBoughtByAllCustomers = " + listOfItemsBoughtByAllCustomers);
    }
}

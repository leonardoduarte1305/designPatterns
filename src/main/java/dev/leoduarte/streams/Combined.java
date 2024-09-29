package dev.leoduarte.streams;

import dev.leoduarte.streams.auxiliary.AnotherOrder;
import dev.leoduarte.streams.auxiliary.Constants;
import dev.leoduarte.streams.auxiliary.Order;
import dev.leoduarte.streams.auxiliary.Product;
import dev.leoduarte.streams.auxiliary.ProductAndQuantity;
import dev.leoduarte.streams.auxiliary.Seller;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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

        // Given a list of sales with seller, product and quantity, group the sales by seller and then get:
        //The seller with the highest number of sales.
        //The best-selling product by each seller.
        final Map<Seller, List<AnotherOrder>> ordersBySellers = Constants.getSellers()
                .stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.flatMapping(seller -> seller.getOrders().stream(),
                                Collectors.toList())
                ));

        final Seller sellerWithHighestNumberOfSales = ordersBySellers.keySet()
                .stream()
                .max(Comparator.comparingInt(seller -> seller.getOrders().size()))
                .orElse(null);
        System.out.println("sellerWithHighestNumberOfSales = " + sellerWithHighestNumberOfSales);

        final Map<String, Product> bestSellingProductBySellersName = ordersBySellers.keySet()
                .stream()
                .collect(Collectors.toMap(
                        Seller::getName,
                        seller -> seller.getOrders().stream()
                                .flatMap(order -> order.getProducts().stream())
                                .collect(Collectors.groupingBy(
                                        ProductAndQuantity::getProduct,
                                        Collectors.summingInt(ProductAndQuantity::getQuantity)))
                                .entrySet()
                                .stream()
                                .max(Map.Entry.comparingByValue())
                                .map(Map.Entry::getKey)
                                .orElseThrow()));
        System.out.println("bestSellingProductBySellersName = " + bestSellingProductBySellersName);


    }
}

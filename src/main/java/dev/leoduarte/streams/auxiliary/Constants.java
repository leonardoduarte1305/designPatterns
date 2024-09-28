package dev.leoduarte.streams.auxiliary;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public interface Constants {

    List<Integer> INTEGERS = Arrays.asList(-10, -9, -8, -7, -6, -5, -4, -3, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> POSITIVE_INTEGERS = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<String> STRINGS_LOWER_CASE = Arrays.asList(
            "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
            "tenth", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    List<Integer> DUPLICATED_INTEGERS = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
    List<Person> PEOPLE = Arrays.asList(
            new Person("Linus Torvalds", 50),
            new Person("Bill Gates", 60),
            new Person("Steve Jobs", 45));
    String LONG_WORD = "antidisestablishmentarianism";
    String INPUT_TXT_PATH = "src/main/java/dev/leoduarte/streams/auxiliary/input.txt";
    List<Transaction> TRANSACTIONS = Arrays.asList(
            new Transaction(Transaction.TransactionType.SELL, new BigDecimal(100)),
            new Transaction(Transaction.TransactionType.BUY, new BigDecimal(200)),
            new Transaction(Transaction.TransactionType.SELL, new BigDecimal(300)),
            new Transaction(Transaction.TransactionType.SELL, new BigDecimal(400)),
            new Transaction(Transaction.TransactionType.BUY, new BigDecimal(500)),
            new Transaction(Transaction.TransactionType.SELL, new BigDecimal(600)),
            new Transaction(Transaction.TransactionType.BUY, new BigDecimal(700)),
            new Transaction(Transaction.TransactionType.BUY, new BigDecimal(800)),
            new Transaction(Transaction.TransactionType.SELL, new BigDecimal(900)),
            new Transaction(Transaction.TransactionType.BUY, new BigDecimal(1000)),
            new Transaction(Transaction.TransactionType.SELL, new BigDecimal(1100))
    );
    List<Product> PRODUCTS = Arrays.asList(
            new Product("New Zealand Bier", Product.Category.BEER, new BigDecimal("5.95")),
            new Product("German Bier", Product.Category.BEER, new BigDecimal("6.75")),
            new Product("American Bier", Product.Category.BEER, new BigDecimal("7.77")),
            new Product("Raiska", Product.Category.VODKA, new BigDecimal("65.65")),
            new Product("Orloff", Product.Category.VODKA, new BigDecimal("75.75")),
            new Product("Red Bull", Product.Category.ENERGETIC, new BigDecimal("4.44")),
            new Product("Tenzin", Product.Category.ENERGETIC, new BigDecimal("4.84")),
            new Product("Monster", Product.Category.ENERGETIC, new BigDecimal("7.87")),
            new Product("Velho Barreiro", Product.Category.CACHACA, new BigDecimal("2.25")),
            new Product("Ypióca Gold", Product.Category.CACHACA, new BigDecimal("3.25")),
            new Product("Casillero del Diablo", Product.Category.WINE, new BigDecimal("17.87"))
    );
    List<Order> ORDERS = Arrays.asList(
            new Order(
                    Arrays.asList(new Product("Raiska", Product.Category.VODKA, new BigDecimal("65.65")),
                            new Product("Orloff", Product.Category.VODKA, new BigDecimal("75.75")))),
            new Order(
                    Arrays.asList(new Product("German Bier", Product.Category.BEER, new BigDecimal("6.75")),
                            new Product("American Bier", Product.Category.BEER, new BigDecimal("7.77")),
                            new Product("Ypióca Gold", Product.Category.CACHACA, new BigDecimal("3.25")))),
            new Order(
                    Arrays.asList(new Product("Casillero del Diablo", Product.Category.WINE, new BigDecimal("17.87")),
                            new Product("Red Bull", Product.Category.ENERGETIC, new BigDecimal("4.44")),
                            new Product("Ypióca Gold", Product.Category.CACHACA, new BigDecimal("3.25")))),
            new Order(
                    Arrays.asList(
                            new Product("Red Bull", Product.Category.ENERGETIC, new BigDecimal("4.44")),
                            new Product("Velho Barreiro", Product.Category.CACHACA, new BigDecimal("2.25")),
                            new Product("American Bier", Product.Category.BEER, new BigDecimal("7.77")),
                            new Product("Orloff", Product.Category.VODKA, new BigDecimal("95.75")))));
}

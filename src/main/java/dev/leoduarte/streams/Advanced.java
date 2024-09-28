package dev.leoduarte.streams;

import dev.leoduarte.streams.auxiliary.Product;
import dev.leoduarte.streams.auxiliary.Transaction;

import java.io.BufferedReader;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static dev.leoduarte.streams.auxiliary.Constants.DUPLICATED_INTEGERS;
import static dev.leoduarte.streams.auxiliary.Constants.INPUT_TXT_PATH;
import static dev.leoduarte.streams.auxiliary.Constants.INTEGERS;
import static dev.leoduarte.streams.auxiliary.Constants.LONG_WORD;
import static dev.leoduarte.streams.auxiliary.Constants.POSITIVE_INTEGERS;
import static dev.leoduarte.streams.auxiliary.Constants.PRODUCTS;
import static dev.leoduarte.streams.auxiliary.Constants.STRINGS_LOWER_CASE;
import static dev.leoduarte.streams.auxiliary.Constants.TRANSACTIONS;
import static java.nio.file.Files.newBufferedReader;

public class Advanced {

    public static void main(String[] args) {
        System.out.print("\n\n");

        //Given a string, count how many times each character appears in the string and return a map where the
        // key is the character and the value is the number of occurrences.
        final Map<String, Long> countingByLetter = LONG_WORD.codePoints()
                .mapToObj(element -> String.valueOf(Character.toChars(element)))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
        System.out.println("countingByLetter = " + countingByLetter);

        // Given a text file, count the number of distinct words using streams and file manipulation.
        try (BufferedReader bufferedReader = newBufferedReader(Path.of(INPUT_TXT_PATH))) {
            final long count = bufferedReader.lines()
                    .flatMap(line -> Arrays.stream(line.split("\\W+"))
                            .map(String::toLowerCase)
                            .filter(word -> !word.isEmpty()))
                    .distinct()
                    .count();
            System.out.println("count = " + count);
        } catch (Exception ignored) {
        }

        // Given a list containing multiple lists of integers, "flatten" them all into a single list.
        final List<Integer> finalIntegerList = Stream.of(INTEGERS, DUPLICATED_INTEGERS, POSITIVE_INTEGERS)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("finalIntegerList = " + finalIntegerList);

        // Given a list of transactions, where each transaction has an amount and a type (e.g. buy, sell),
        // group the transactions by type.
        final Map<Transaction.TransactionType, List<Transaction>> listOfTransactionsByType = TRANSACTIONS.stream()
                .collect(Collectors.groupingBy(Transaction::getType));
        System.out.println("listOfTransactionsByType = " + listOfTransactionsByType);

        // Given a list of words, return the three shortest words.
        final List<String> smallestString = STRINGS_LOWER_CASE.stream()
                .sorted(Comparator.comparingInt(String::length))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("smallestString = " + smallestString);

        // Given a list of integers, use IntSummaryStatistics to get the sum, average, minimum, maximum, and count.
        IntSummaryStatistics intSummaryStatistics = DUPLICATED_INTEGERS.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("intSummaryStatistics = " + intSummaryStatistics);

        final Map<Product.Category, List<Product>> productListByCategory = PRODUCTS.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.toList()));
        System.out.println("productListByCategory = " + productListByCategory);
    }

}

package dev.leoduarte.streams;

import java.util.stream.Collectors;

import static dev.leoduarte.streams.auxiliary.Constants.INTEGERS;
import static dev.leoduarte.streams.auxiliary.Constants.POSITIVE_INTEGERS;
import static dev.leoduarte.streams.auxiliary.Constants.STRINGS_LOWER_CASE;

public class Basics {

    public static void main(String[] args) {
        System.out.print("\n\n");

        // Given a list of integers, return a new list where each value is twice the original value.
        final var twiceOfOriginal = POSITIVE_INTEGERS.stream()
                .map(element -> element * 2)
                .collect(Collectors.toList());
        System.out.println("twiceOfOriginal = " + twiceOfOriginal);

        // Given a list of integers, return only even numbers.
        final var oddNumbers = POSITIVE_INTEGERS.stream()
                .filter(element -> element % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("oddNumbers = " + oddNumbers);

        // Dada uma lista de strings, retorne uma nova lista onde todas as strings estejam em maiúsculas.
        final var upperCaseStrings = STRINGS_LOWER_CASE.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("upperCaseStrings = " + upperCaseStrings);

        // Given a list of integers, use the reduce method to sum all the values in the list.
        final var reducedToSum = POSITIVE_INTEGERS.stream()
                .reduce(0, Integer::sum);
        System.out.println("reducedToSum = " + reducedToSum);

        // Given a list of strings, count how many strings start with the letter "f".
        final var stringsStartedWithFCount = STRINGS_LOWER_CASE.stream()
                .filter(string -> string.startsWith("f"))
                .count();
        System.out.println("stringsStartedWithFCount = " + stringsStartedWithFCount);

        // Using streams, find the largest number in a list of integers.
        final var maxValue = POSITIVE_INTEGERS.stream()
                .max(Integer::compareTo)
                .orElse(null);
        System.out.println("maxValue = " + maxValue);

        // Given a list of integers, check if all numbers are positive.
        final var hasOnlyPositiveNumbers = INTEGERS.stream()
                .allMatch(integer -> integer > 0);
        System.out.println("hasOnlyPositiveNumbers = " + hasOnlyPositiveNumbers);

    }

}

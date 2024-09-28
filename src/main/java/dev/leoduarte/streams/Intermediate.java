package dev.leoduarte.streams;

import dev.leoduarte.streams.auxiliary.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static dev.leoduarte.streams.auxiliary.Constants.DUPLICATED_INTEGERS;
import static dev.leoduarte.streams.auxiliary.Constants.PEOPLE;
import static dev.leoduarte.streams.auxiliary.Constants.STRINGS_LOWER_CASE;

public class Intermediate {

    public static void main(String[] args) {
        System.out.print("\n\n");

        // Given a list of strings, concatenate them all into a single string, separated by commas.
        final var concatenatedStrings = STRINGS_LOWER_CASE.stream()
                .collect(Collectors.joining(","));
        System.out.println("concatenatedStrings = " + concatenatedStrings);


        // Given a list of strings, concatenate them all into a single string, separated by commas.
        final var concatenatedStringsUsingStringJoin = String.join(",", STRINGS_LOWER_CASE);
        System.out.println("concatenatedStrings = " + concatenatedStrings);

        // Given a list of words, group them according to the number of characters in each word.
        final var stringsPerLenght = STRINGS_LOWER_CASE.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(string -> string, Collectors.toList())));
        System.out.println("stringsPerLenght = " + stringsPerLenght);

        // Given a list of integers with duplicate elements, remove the duplicates using streams.
        final var distinctListOfIntegers = DUPLICATED_INTEGERS.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinctListOfIntegers = " + distinctListOfIntegers);

        // Given a list of Person objects with attributes name and age, convert the list into a map where the key is name and the value is age.
        final var agePerName = PEOPLE.stream()
                .collect(Collectors.groupingBy(Person::getName, Collectors.mapping(Person::getAge, Collectors.toList())));
        System.out.println("agePerName = " + agePerName);

        // Given a list of integers, filter the numbers that are greater than the average of all the values in the list.
        final List<Integer> greaterThanAverage = DUPLICATED_INTEGERS
                .stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.averagingInt(Integer::intValue),
                        average -> DUPLICATED_INTEGERS.stream()
                                .filter(number -> number > average)
                                .collect(Collectors.toList())
                ));
        System.out.println("greaterThanAverage = " + greaterThanAverage);

        // Given a list of strings, sort them based on the length of each string.
        final List<String> orderedListOfStringByLength = STRINGS_LOWER_CASE.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("orderedListOfStringByLength = " + orderedListOfStringByLength);

        // Given a list of strings, find the longest word using streams.
        final String greaterString = STRINGS_LOWER_CASE.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("greaterString = " + greaterString);
    }

}

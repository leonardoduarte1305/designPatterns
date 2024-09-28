package dev.leoduarte.streams.auxiliary;

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
}

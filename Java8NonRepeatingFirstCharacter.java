package com.example.demo.java8;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import static java.util.function.Function.identity;

public class Java8NonRepeatingFirstCharacter {

    public static void main(String[] args) {
        findFirstNonRepeatingLetter("this is a java program", System.out::println);
    }

    private static void findFirstNonRepeatingLetter(String s, Consumer<Character> callback) {
        s.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey()) //Map.Entry::getKey
                .findFirst().map(c -> { callback.accept(c); return c; } );
    }
}

//Output: t
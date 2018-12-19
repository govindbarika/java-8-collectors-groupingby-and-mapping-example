package com.example.demo.java8.grouingBy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccurancesExample {
    public static void main(String[] args) {
        int[] inputOne = {2,2,0,0,0,0,0,1};
        int[] inputTwo = {1,1,1,1,1,0};
        int[] inputThree = {1,2,3,4,6,5,5,5,5,5,5,5,5,5,5};
        countOccuranceOfANumber(inputOne);
        countOccuranceOfANumber(inputTwo);
        countOccuranceOfANumber(inputThree);

        List<String> result = Stream.of("EURO/INR", "USD/AUD", "USD/GBP", "USD/EURO")
                                .filter(e -> e.length() > 7) .peek(e -> System.out.println("Filtered value: " + e))
                                .map(String::toLowerCase)
                                .peek(e -> System.out.println("Mapped value: " + e))
                                .collect(Collectors.toList());

    }

    public static void countOccuranceOfANumber(int[] intArray){
        List<Integer> input = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        Map<Integer, Long> counts = input.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        counts.forEach((key, value) -> System.out.println(key + " FOR " + value));
        System.out.println("----------");
    }
}

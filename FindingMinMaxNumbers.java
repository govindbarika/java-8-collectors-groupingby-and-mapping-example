package com.example.demo.java8;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindingMinMaxNumbers {
    public static void main(String[] args) {
        //To find min and max number from stream of numbers, use Comparator.comparing( Integer::valueOf ) like comparators
        // Get Min or Max Number
        Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);
    }
}

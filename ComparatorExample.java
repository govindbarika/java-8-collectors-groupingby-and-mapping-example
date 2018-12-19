package com.example.demo.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
List<String> names = new ArrayList<>();
names.add("govind");
names.add("barika");
names.add("ravi");
names.add("raju");
names.add("ashok");
List<String> sortedNames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedNames);

        //names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
/*List<Integer> numbers = Arrays.asList(2,4,3,6,8,10,34,23);
        System.out.println(numbers.stream().max(Collectors.));*/
    }
}

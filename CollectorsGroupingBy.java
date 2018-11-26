package com.example.demo.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsGroupingBy {

    public static void main(String[] args) {
        List<String> items = Arrays.asList("banana", "orange", "banana", "apple", "banana", "banana", "apple");
        Map<String, Long> result = items.stream()
                                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result); //{orange=1, banana=4, apple=2}

        Map<String, Long> finalMap = new LinkedHashMap<>();
        //sorting by values
         result.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e-> finalMap.put(e.getKey(), e.getValue()));
        //.collect(Collectors.toMap(e -> finalMap.put(e.getKey(), e.getValue())));


    }


}

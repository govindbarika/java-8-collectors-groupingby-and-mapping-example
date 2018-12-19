package com.example.demo.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveAnEntryFromMap {

    public static void main(String[] args) {
        // create HashMap
        Map<String, Integer> map = new HashMap<String, Integer>();

        // put few items
        map.put("Ravi", 200);
        map.put("Raju", 27);
        map.put("Govind", 104);
        map.put("Ghouse", 131);
        map.put("Suresh", 168);

        map.entrySet().removeIf(entry -> entry.getValue() >190);

        System.out.println(map.toString());

        List<String> names = Arrays.asList("Govind", "Ravi", "Ghouse", "Suresh");
        names.removeIf("Govind"::equals);
    }
}


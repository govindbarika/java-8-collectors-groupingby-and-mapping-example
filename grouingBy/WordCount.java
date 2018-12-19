package com.example.demo.java8.grouingBy;

import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;


public class WordCount {

    public WordCount(String sentence) {

        super();
        setSentence(sentence);

    }

    private String sentence;
    private String[] words;

    public Map<String, Long> getWordCounts(){
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public Map<Integer, List<String>> getWordLength(){
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length));
    }

    public Map<Integer, Collection<String>> getWordLength_Set(){
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length, Collectors.toCollection(TreeSet::new)));
    }

    public Map<Integer, List<String>> getWordLength_List(){
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
    }

    public Map<Integer, String> getWordLength_String(){
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length, Collectors.joining("|","[","]")));
    }


    public Map<Integer, IntSummaryStatistics> getWordLength_summarizingInt(){
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length, Collectors.summarizingInt(String::hashCode)));

    }

    protected String getSentence() {
        return sentence;
    }

    protected void setSentence(String sentence) {
        this.sentence = sentence.replaceAll("[;,.]","");
        words = this.sentence.split(" ");
    }

}
package lesson17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamTask5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b2", "c3", "a1");

        System.out.println("First task");
        var withoutDuplicates = list
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Array without duplicates : " + withoutDuplicates + "\n");


        System.out.println("Second task");
        var withoutDuplicatesToUpperCase = list
                .stream()
                .distinct()
                .collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));

        System.out.println("Array without duplicates in upper case: " + withoutDuplicatesToUpperCase + "\n");



        System.out.println("Third task");
        var joinString = list
                .stream()
                .collect(Collectors.joining(":", "<b>", "</b>"));

        System.out.println("Joined string : " + joinString + "\n");



        System.out.println("Fourth task");

        Map<Character, Character> map = list
                .stream()
                .distinct()
                .collect(Collectors.toMap(s -> s.charAt(0), s -> s.charAt(1)));

        System.out.println(map + "\n");


        System.out.println("Fifth task");
        Map<Character, List<String>> groupByFirst = list
                .stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(groupByFirst + "\n");


        System.out.println("Sixth task");
        Map<Character, String> groupFirstAndFormat = list
                .stream()
                .collect(Collectors.toMap(s -> s.charAt(0), s -> s.substring(1), (s1, s2) -> s1 + ":" + s2));

        System.out.println(groupFirstAndFormat + "\n");







    }



}


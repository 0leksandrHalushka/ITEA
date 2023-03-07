package lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask2 {

    public static void main(String[] args) {

       List<String> collection1 = Arrays.asList("a1", "a2", "a3", "a1");
        List<String> collection2 = Arrays.asList("1,2,0", "4,5");


        System.out.println("First task");
        collection1
                .stream()
                .map(s -> s + "_1")
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Second task");
        int [] nums = collection1
                .stream()
                .mapToInt(str -> Integer.parseInt(str.substring(1)))
                .toArray();
        System.out.println(Arrays.toString(nums)  + "\n");


        System.out.println("Third task");
                String result =  collection2.stream()
                        .flatMap(str -> Arrays.stream(str.split(",")))
                        .collect(Collectors.joining(","));

        System.out.println(result + "\n");


        System.out.println("Fourth task");
        int sum =  collection2.stream()
                .flatMap(str -> Arrays.stream(str.split(",")))
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(sum);



    }


}

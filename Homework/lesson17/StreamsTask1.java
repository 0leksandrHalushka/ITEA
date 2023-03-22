package lesson17;

import java.util.Arrays;
import java.util.List;

public class StreamsTask1 {

    public static void main(String[] args) throws Throwable {


        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");

        System.out.println("First task");
                var count = list
               .stream()
               .filter("a1" ::equals)
               .count();

        System.out.println("number of occurrences \"а1\": " + count + "\n");


        System.out.println("Second task");
        String firstElement = list
                .stream()
                .findFirst()
                .orElse("0").toString();

        System.out.println("First element: " + firstElement + "\n");



        System.out.println("Third task");
        String lastElement = list
                .stream()
                .skip(list.size()-1)
                .findFirst()
                .orElse("Empty").toString();

        System.out.println("First element: " + lastElement + "\n");



        System.out.println("Fourth task");
        String a3Element = list
                .stream()
                .filter("a3" ::equals)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Element 'a3' not found")).toString();

        System.out.println("a3 element: " + a3Element + "\n");

        System.out.println("Fifth task");
                 list
                .stream()
                .skip(2)
                .findFirst().toString();

        System.out.println("Third element: " + a3Element + "\n");


        System.out.println("Sixth task");
                list
                .stream()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        System.out.println();


        System.out.println("Seventh task");
                list
                .stream()
                .filter(s -> s.toString().contains("1"))
                .forEach(System.out::println);



    }




}

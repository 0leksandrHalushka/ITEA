package lesson17;

import java.util.Arrays;
import java.util.List;

public class StreamsTask4 {



    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 2);

        System.out.println("First task");
                int sum = nums
                        .stream()
                        .reduce(0, (a, b) -> a+ b);

        System.out.println("Sum = " + sum + "\n");

        System.out.println("Second task");
        int max = nums
                .stream()
                .reduce(Integer::max)
                .orElse(0);

        System.out.println("Max = " + max + "\n");

        System.out.println("Third task");
        int sumOdd = nums
                .stream()
                .filter(num -> num % 2 != 0)
                .reduce(0,(a, b) -> a + b);

        System.out.println("Sum odd numbers = " + sumOdd + "\n");


    }



}

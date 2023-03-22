package lesson19.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Beer> beers = new ArrayList<>();
        beers.add(new Beer("Art", "White", false, "UKR", new ArrayList<>(), new ArrayList<>()));

        Parser parser = new Parser();
        beers.add(parser.parse());
        beers.stream()
                .sorted(Comparator.comparing(Beer::getName)
                        .thenComparing(Beer::getType)
                        .thenComparing(Beer::isAlcohol))
                .forEach(System.out::println);

    }


}

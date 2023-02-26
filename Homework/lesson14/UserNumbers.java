package lesson14;

import java.util.*;

public class UserNumbers {

    public static void main(String[] args) {

        String userString = "1, 2, 2, 3, 4, 5";

        Set<String> userNumbers = new HashSet<>(List.of(userString.split(", ")));

        Iterator iterator = userNumbers.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }


}

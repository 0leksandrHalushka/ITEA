package lesson3;

/*
 Створіть масив з 12 випадкових цілих чисел з відрізка [-15; 15].
  Визначте який елемент є в цьому масиві максимальним і повідомте індекс його останнього входження в масив.
 */

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int array [] = new  int[12];
        int indexMaxNum = 0;
        int maxArray;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(-15, 16);
        }

        maxArray = array [0];

        for (int i = 0; i < array.length; i++) {
            if (maxArray < array [i]) {
                maxArray = array[i];
                indexMaxNum = i;
            }
        }
        System.out.print("Array with random numbers:");
        System.out.println(Arrays.toString(array));
        System.out.println("Max number in array: " + maxArray);
        System.out.println("Index max number in array: " + indexMaxNum);
    }
}

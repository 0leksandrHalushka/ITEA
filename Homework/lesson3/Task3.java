package lesson3;

/*
  1. Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99]
  2. Виведіть його на екран у рядок.
  3. Далі визначте і виведіть на екран повідомлення про те, чи є масив строго зростаючої послідовністю.
 */

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int array [] = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(10, 100);
        }

        System.out.print("Масив рандомних чисел: ");
        System.out.println(Arrays.toString(array));

        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3])
            System.out.println("Є строго зростаючою послідовністю");
        else System.out.println("Не є строго зростаючою послідовністю" );
    }
}

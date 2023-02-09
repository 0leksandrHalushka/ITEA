package lesson3;

/*
  1.Створіть масив з 8-ми випадкових цілих чисел з відрізка [1; 10]
  2.Виведіть масив на екран у результаті
  3.Замініть кожен елемент з непарним індексом на нуль
  4.Знову виведіть масив на екран
 */

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int array [] = new int[8];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 11);
        }

        System.out.println("Array with random numbers:");
        for (int element: array) {
            System.out.print(element + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                array[i] = 0;
            }
        }

        System.out.println("\nArray after replacing odd numbers:");
        for (int element: array) {
            System.out.print(element + " ");
        }
    }

}


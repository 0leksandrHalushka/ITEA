package lesson3;

/*
  1. Створіть 2 масива з 5 випадкових цілих чисел з відрізка [0; 5] кожен
  2. Виведіть масиви на екран в двох окремих рядках
  3. Порахуйте середнє арифметичне елементів кожного масиву і повідомте, для якого з масивів це значення виявилося більше (або повідомте, що їх середнє арифметичне рівні)
 */

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int array1 [] = new int[5];
        int array2 [] = new int[5];
        double arithmeticMean1;
        double arithmeticMean2;
        int sumArray1 = 0;
        int sumArray2 = 0;
        Random random = new Random();

        for (int i = 0; i < 5; i++) {                        //filling arrays
            array1[i] = random.nextInt(6);
            array2[i] = random.nextInt(6);
        }
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        for (int element: array1) {                          //calculation sum numbers array 1
            sumArray1 += element;
        }
        for (int element: array2) {                          //calculation sum numbers array 1
            sumArray2 += element;
        }

        arithmeticMean1 = (double) sumArray1 / array1.length; //calculation arithmetic mean array 1
        arithmeticMean2 = (double) sumArray2 / array2.length; //calculation arithmetic mean array 2

        System.out.println("Arithmetic mean array 1: " + arithmeticMean1);
        System.out.println("Arithmetic mean array 2: " + arithmeticMean2);

        if (arithmeticMean1 == arithmeticMean2) {             //arithmetic mean comparison
            System.out.println("Arithmetic mean array 1 = Arithmetic mean array 2");
        } else if (arithmeticMean1 < arithmeticMean2) {
            System.out.println("Arithmetic mean array 1 < Arithmetic mean array 2");
        } else System.out.println("Arithmetic mean array 1 > Arithmetic mean array 2");
    }
}

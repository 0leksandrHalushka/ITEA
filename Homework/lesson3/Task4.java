package lesson3;

/*
 Напишіть програму, яка міняє місцями елементи одновимірного масиву з String в зворотному порядку.
 Не використовуйте додатковий масив для зберігання результатів.
 */
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String array [] = {"first", "second", "third", "fourth", "fifth"};
        String buffer;

        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            buffer = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buffer;
        }
        System.out.print("Reverse array: ");
        System.out.println(Arrays.toString(array));
    }
}

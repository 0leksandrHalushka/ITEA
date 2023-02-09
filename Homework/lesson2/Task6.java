package lesson2;
/*

Задача №6
Необхідно вивести в консоль таку послідовність чисел:
1 2 4 8 16 32 64 128 256 512

 */

public class Task6 {
    public static void main(String[] args) {

        int result = 1;

        while (result <= 512) {
            System.out.print(result + " ");
            result *= 2;
        }
    }
}

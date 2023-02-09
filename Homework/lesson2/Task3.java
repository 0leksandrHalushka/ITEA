package lesson2;
/*

Задача №3
Необхідно вивести в консоль таблицю множення на 3. В консолі має буде:

3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30

 */

public class Task3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + (3 * i));
        }
    }
}

package lesson2;
/*

Задача №4
Напишіть програму, де користувач вводить будь-яке ціле позитивне число. Програма суммує всі цифри від 1 до введеного користувача числом.

Наприклад:

якщо користувач вводить число 3. Програма повинна порахувати суму від 1 до 3, тобто 1 + 2 + 3 і видавати відповідь 6.
якщо користувач вводить число 5. Програму повинна порахувати суму від 1 до 5, тобто 1 + 2 + 3 + 4 + 5 і видавати відповідь 15.


 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть ціле число:");

        int userNumber = in.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            result += i;
        }
        System.out.println("Сума чисел від 1 до " + userNumber + " = " + result);
    }
}

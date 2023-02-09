package lesson2;
/*

Задача-загадка №7 (цикли та перемикачі оператора)

Представляємо, що у нас є загадка: "Що то є таке: синє, велике, з вусами та повне зайців?" Відповідь: тролейбус.
Напишіть програму, яка буде зчитувати з консолі відповіді:
у користувача є 3 спроби. Після трьох відповідей програма повинна завершитись;
якщо користувач вводить "Тролейбус", ми виводимо в консоль "Правильно!" і виходимо з цикла;
якщо користувач вводить "Здаюсь", ми виводимо в консоль "Правильна відповідь: тролейбус". і виходимо з цикла;
якщо користувач вводить будь-яку іншу відповідь, ми виводимо в консоль "Подумайте ще". і продовжуємо цикл.

 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        String answer = "Тролейбус";
        String keyWord = "Здаюсь";
        int count = 1;

        Scanner inputAnswer = new Scanner(System.in);

        System.out.println("Відгадайте загадку з 3 спроб: \nЩо то є таке: синє, велике, з вусами та повне зайців?");

        while (count <= 3) {

            System.out.println("Спроба №" + count);

            String userAnswer = inputAnswer.next();

            if (userAnswer.equalsIgnoreCase(keyWord)) { // checking key word "Здаюсь"
                System.out.println("Правильна відповідь: " + answer);
                break;
            }
            if (userAnswer.equalsIgnoreCase(answer)) {   // checking user answer
                System.out.println("Правильно!");
                break;
            } else if (count == 3) break;
            else {
                System.out.println("\nПодумайте ще!\nЯкщо бажаєте продовжити введіть нове слово. Якщо ні, то введіть слово " + "\"" + keyWord + "\".");
                count++;
            }
        }
        System.out.println("Гру закінчено!");
    }
}




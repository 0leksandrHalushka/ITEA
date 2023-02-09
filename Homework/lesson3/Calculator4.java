package lesson3;

/*
Модифікувати калькулятор, щоб після підрахунку не завершував роботу а видавав повідомлення чи не бажаємо виконати ще раз

додати перевірки на невалідні числа та операції з варіантом правильного введення

додати перевірку  перед діленням (ділення на 0)

Зробити можливість вводити числа та операції допоки не введемо = та тоді отримати результат
 */

import java.util.Scanner;

public class Calculator4 {

    public static void main(String[] args) {

        double result = getNum();
        String operator = getOperator();
        double num = getNum();

        while (true) {

            if (operator.equals("/") && num == 0) {
                System.out.println("Ділення на 0");
                result = 0;
            } else {
                switch (operator) {

                    case "+": result = sum(result, num);
                    break;
                    case "-": result = diff(result, num);
                    break;
                    case "*": result = multi(result, num);
                    break;
                    case "/": result = div(result, num);
                    break;
                    default: System.out.println("Некорректний оператор! Програма підтримує наступні операції \"+\" \"-\" \"*\" \"/\""); {
                        break;
                    }
                }

                }

            System.out.println("Для того щоб продовжити роботу введіть новий оператор\nЩоб отримати результат введіть\"=\"");
            Scanner in = new Scanner(System.in);
            if (in.hasNext("=")) break;
            else {
                operator = in.next();
                num = getNum();
            }

            }
        System.out.println("Результат = " + result);
        }
    static int getNum () {
        System.out.println("Введіть ціле число");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            return in.nextInt();
        }
        else {
            System.out.println("Число не є цілим");
            return getNum();
        }
    }

   private static String getOperator(){
        System.out.println("Введіть оператор");
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    static double div(double num1, double num2) {
        return  (num1 / num2);
    }

    static double multi(double num1, double num2) {
        return (num1 * num2);
    }

    static double sum(double num1, double num2) {
        return (num1 + num2);
    }

    static double diff(double num1, double num2) {
        return (num1 - num2);
    }

}
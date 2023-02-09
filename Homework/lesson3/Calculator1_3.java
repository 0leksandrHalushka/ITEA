package lesson3;

import java.util.Scanner;

/*
Модифікувати калькулятор, щоб після підрахунку не завершував роботу а видавав повідомлення чи не бажаємо виконати ще раз

додати перевірки на невалідні числа та операції з варіантом правильного введення

додати перевірку  перед діленням (ділення на 0)

Зробити можливість вводити числа та операції допоки не введемо = та тоді отримати результат
 */

public class Calculator1_3 {

        public static void main(String[] args) {

            int num1, num2;
            String operator;

            num1 = getNum();
            num2 = getNum();
            operator = getOperator();

            while (!"=".equals(operator)) {

                if (operator.equals("/") && num2 == 0) System.out.println("Ділення на 0");
                else {
                    switch (operator) {
                        case "+" -> System.out.println(num1 + " " + operator + " " + num2 + " = " + sum(num1, num2));
                        case "-" -> System.out.println(num1 + " " + operator + " " + num2 + " = " + diff(num1, num2));
                        case "*" -> System.out.println(num1 + " " + operator + " " + num2 + " = " + multi(num1, num2));
                        case "/" -> System.out.println(num1 + " " + operator + " " + num2 + " = " + div(num1, num2));
                        default -> System.out.println("Некорректний оператор! Програма підтримує наступні операції \"+\" \"-\" \"*\" \"/\"");
                    }
                }

                System.out.println("Щоб продовжити введіть нове число\nЩоб завершити роботу введіть\"=\"");
                Scanner in = new Scanner(System.in);
                if (in.hasNext("=")) {
                    operator = "=";
                } else if (in.hasNextInt()){
                    num1 = in.nextInt();
                    num2 = getNum();
                    operator = getOperator();
                } else {
                    num1 = getNum();
                    num2 = getNum();
                    operator = getOperator();
                }

            }

            System.out.println("Вихід з програми!");
        }

       static int getNum () {
            System.out.println("Введіть ціле число");
            int number;
            Scanner in = new Scanner(System.in);

            if (in.hasNextInt()) {
                number = in.nextInt();
                return number;
            }
            else return getNum();
        }

        static String getOperator(){
            System.out.println("Введіть оператор");
            Scanner in = new Scanner(System.in);
            return in.next();
        }

        static double div(int num1, int num2) {
            return  ((double) num1 / (double) num2);
        }

        static int multi(int num1, int num2) {
            return (num1 * num2);
        }

        static int sum(int num1, int num2) {
            return (num1 + num2);
        }

        static int diff(int num1, int num2) {
            return (num1 - num2);
        }

   }

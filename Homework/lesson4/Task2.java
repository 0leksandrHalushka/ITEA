package lesson4;

/*
2- Напишіть програму Java для об'єднання введенного рядка до кінця іншого рядка

String 1: PHP Exercises and
String 2: Python Exercises
The concatenated string: PHP Exercises and Python Exercises
 */
public class Task2 {

    static String str1 = "PHP Exercises and";
    static String str2 = "Python Exercises";


    static void concatenation (String str1, String str2){

        System.out.println(str1 + " " + str2);
    }

    public static void main(String[] args) {
        concatenation(str1, str2);
    }

}

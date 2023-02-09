package lesson4;

/*
1- Паліндром, перевертень — слово, число, набір символів, словосполучення або віршований рядок, що однаково читається в обох напрямках (зліва направо та справа наліво).
Написати програму яка визначить чи є введена строка паліндромом

String 1: 123ACA321
Your string: 123ACA321 is palindrome

String 1: 123ABC
Your string: 123ABC is not palindrome
 */
public class Task1 {

    static String str1 = "123ACA321";
    static String str2 = "123ABC";

    static void isPalindrome(String str) {

        StringBuilder string = new StringBuilder(str);

        if (str.equals(string.reverse().toString())) {
            System.out.println("String is palindrome");
        } else System.out.println("String is not palindrome");

    }

    public static void main(String[] args) {

       isPalindrome(str1);
       isPalindrome(str2);

    }

}

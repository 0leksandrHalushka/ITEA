package lesson4;

/*
4 - Напишіть програму Java, щоб повернути новий рядок, використовуючи всі символи парних позицій з даного рядка.
The given string is: test string
The new string is: ts srn
 */
public class Task4 {

    static String str = "test string";

    static void replaceString(String str) {

        String str1 = str.replace(" ", "  ");
        String strAfterDelete = "";

        char charsString[] = str1.toCharArray();

        for (int i = 0; i < charsString.length; i++) {
            if (i % 2 == 0) {
                strAfterDelete += charsString[i];
            }
        }

        System.out.println("String after deleted paired characters:" + strAfterDelete);

        }

    public static void main (String[]args){
        replaceString(str);
    }
}

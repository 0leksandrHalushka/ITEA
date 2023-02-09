package lesson4;
/*
3- Напишіть програму java для порівняння двох рядків лексикографічно, не враховуючи розбіжності у розкладці

String 1: This is exercise 1
String 2: This is Exercise 1
"This is exercise 1" is equal to "This is Exercise 1"
 */
public class Task3 {

    static String str1 = "This is exercise 1";
    static String str2 = "This is Exercise 1";

    static void comparison (String str1, String str2){
        int count;
        count =Math.abs(str1.compareToIgnoreCase(str2));

        if (count != 0) {
           System.out.println("String " + "\"" + str1 + "\"" + " and " + "\"" + str2 + "\" " + " has " + count + " differences");
        } else System.out.println("String " + "\"" + str1 + "\"" + " equal to " + "\"" + str2 + "\"");

    }

    public static void main(String[] args) {
        comparison(str1, str2);
    }

}

package lesson4;
/*
2- Напишіть програму для друку площі прямокутника, створивши клас під назвою «Area»,
приймаючи значення його довжини та ширини як параметри свого конструктора та маючи метод під назвою «returnArea»,
який повертає площу прямокутника.
Довжина і ширина прямокутника вводяться з клавіатури.
 */

import java.util.Scanner;

public class Area {

    static double length;
    static double width;

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static double returnArea(double length, double width){
        return length * width;
    }

    static double inLength (){
        System.out.println("Enter the length of the rectangle from the keyboard");
        Scanner inLength = new Scanner(System.in);
        return inLength.nextDouble();
    }
    static double inWidth (){
        System.out.println("Enter the width of the rectangle from the keyboard");
        Scanner inWidth = new Scanner(System.in);
        return inWidth.nextDouble();
    }

    public static void main(String[] args) {
        System.out.println("Rectangle area = " + returnArea(inLength(), inWidth()));
    }

}

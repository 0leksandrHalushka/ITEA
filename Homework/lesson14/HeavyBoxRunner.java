package lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

public class HeavyBoxRunner {

    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxArrayList = new ArrayList<>();

        //заповнюємо List об'єктами класу HeavyBox
        for (int i = 1; i < 11; i++) {
            heavyBoxArrayList.add(new HeavyBox(new Random().nextInt(100, 500)));
        }

        System.out.println("Створений List HeavyBox без змін:");

        //друк List
        for (HeavyBox box : heavyBoxArrayList) {
            System.out.print(box + ", ");
        }

        System.out.println("\nЗаміна першого HeavyBox на HeavyBox за вагою  = 1:");

        //заміна першого HeavyBox на HeavyBox за вагою "1"
        heavyBoxArrayList.set(0, new HeavyBox(1));

        //друк List
        for (HeavyBox box : heavyBoxArrayList) {
            System.out.print(box + ", ");
        }

        System.out.println("\nВидалення останнього елементу HeavyBox:");

        //видаляємо останній елемент
        heavyBoxArrayList.remove(heavyBoxArrayList.size() - 1);

        //друк List
        for (HeavyBox box : heavyBoxArrayList) {
            System.out.print(box + ", ");
            }

        System.out.println("\nПеретворення heavyBoxList в массив та друк массиву трьома способами:");

        //перетворення heavyBoxList в массив
        Object [] heavyBoxesArray = heavyBoxArrayList.toArray();


        //вивід в консоль массиву спосіб №1
        System.out.println(Arrays.toString(heavyBoxesArray));

        //вивід в консоль массиву спосіб №2
        for (int i = 0; i < heavyBoxesArray.length; i++) {
            System.out.print(heavyBoxesArray[i] + ", ");
        }
        System.out.println();

        //вивід в консоль массиву спосіб №3
        for (Object box: heavyBoxesArray) {
            System.out.print(box + ", ");
        }

        System.out.println("\nДрук heavyBoxTreeSet:");

        TreeSet<HeavyBox> heavyBoxTreeSet = new TreeSet<>();

        // заповнення heavyBoxTreeSet
        for (int i = 0 ; i < 10 ; i++) {
            heavyBoxTreeSet.add(new HeavyBox(new Random().nextInt(100, 500)));
        }

        for (HeavyBox box: heavyBoxTreeSet) {
            System.out.print("Box weight = " + box + ", ");
        }





    }

}

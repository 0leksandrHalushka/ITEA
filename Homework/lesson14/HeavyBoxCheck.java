package lesson14;

import java.util.ArrayList;
import java.util.Random;

public class HeavyBoxCheck {

    public static void main(String[] args) {

        ArrayList<HeavyBox> heavyBoxArrayList = new ArrayList<>();
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();


        //заповнюємо List об'єктами класу HeavyBox
        for (int i = 1; i < 11; i++) {
            heavyBoxArrayList.add(new HeavyBox(new Random().nextInt(50, 400)));
        }

        // для наглядності вивоимо heavyBoxArrayList в консоль
        System.out.println(heavyBoxArrayList);

        //перевірка масси HeavyBox і перенос його в новий ArrayList
        for (HeavyBox box: heavyBoxArrayList) {
            if (box.getWeight() > 300) {
                heavyBoxes.add(box);
            }

        }

        System.out.println(heavyBoxes);

    }

}

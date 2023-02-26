package lesson14;

import java.util.ArrayDeque;
import java.util.Iterator;

public class HeavyBoxDeque {

    public static void main(String[] args) {

        ArrayDeque <HeavyBox> heavyBoxArrayDeque = new ArrayDeque<>();

        heavyBoxArrayDeque.offer(new HeavyBox(200));
        heavyBoxArrayDeque.offer(new HeavyBox(500));
        heavyBoxArrayDeque.offer(new HeavyBox(700));
        heavyBoxArrayDeque.offer(new HeavyBox(1010));
        heavyBoxArrayDeque.offer(new HeavyBox(1200));

        Iterator iterator = heavyBoxArrayDeque.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        heavyBoxArrayDeque.poll();

        for (HeavyBox box: heavyBoxArrayDeque) {
            System.out.println(box.toString());

        }

    }
}

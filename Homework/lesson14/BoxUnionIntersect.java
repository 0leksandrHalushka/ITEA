package lesson14;

import java.util.HashSet;
import java.util.Set;

public class BoxUnionIntersect {

    static void union(Set<HeavyBox> set1, Set<HeavyBox> set2){
        set1.addAll(set2);
        System.out.println("Boxes after union: " + set1);
    }

    static void intersect(Set<HeavyBox> set1, Set<HeavyBox> set2){
        set1.retainAll(set2);
        System.out.println("Boxes after intersect: " + set1);
    }


    public static void main(String[] args) {

        Set<HeavyBox> s1 = new HashSet<>();
        Set<HeavyBox> s2 = new HashSet<>();

        s1.add(new HeavyBox(10));
        s1.add(new HeavyBox(20));
        s1.add(new HeavyBox(30));
        s1.add(new HeavyBox(40));
        s1.add(new HeavyBox(50));

        s2.add(new HeavyBox(60));
        s2.add(new HeavyBox(70));
        s2.add(new HeavyBox(50));
        s2.add(new HeavyBox(80));
        s2.add(new HeavyBox(90));

        union(s1, s2);
        intersect(s1, s2);


    }


}

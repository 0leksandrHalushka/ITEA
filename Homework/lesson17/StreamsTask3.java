package lesson17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamsTask3 {

    public static class People{

        private String name;
        private  int age;
        private Sex sex;

        public People(String name, int age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }


        public Sex getSex() {
            return sex;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            People people = (People) o;
            return age == people.age && Objects.equals(name, people.name) && sex == people.sex;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    private enum Sex{
        MAN, WOMEN;

    }


    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");
        List<People> people = Arrays.asList(new People ("Вася", 16, Sex.MAN), new People ("Петя", 23, Sex.MAN), new People ("Олена", 42, Sex.WOMEN) , new People ("Іван Іванович", 69, Sex.MAN));


        System.out.println("First task:");
        var sortedList1 = list
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList1 + "\n");

        System.out.println("Second task:");

        var sortedList2 = list
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedList2 + "\n");


        System.out.println("Third task:");
        var sortedList3 = list
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList3 + "\n");



        System.out.println("Fourth task:");
        var sortedList4 = list
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedList4 + "\n");


        System.out.println("Fifth task:");
        var sortedPeopleList1 = people
                .stream()
                .sorted(Comparator.comparing(People::getName).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedPeopleList1 + "\n");


        System.out.println("Sixth task:");
        var sortedPeopleList2 = people
                .stream()
                .sorted(Comparator.comparing(People::getSex).thenComparing(People::getAge))
                .collect(Collectors.toList());

        System.out.println(sortedPeopleList2 + "\n");

        System.out.println("Seventh task:");
        var maxInList = list
                .stream()
                .max(String::compareTo);

        System.out.println(maxInList + "\n");

        System.out.println("Eighth task:");
        var minInList = list
                .stream()
                .min(String::compareTo);

        System.out.println(minInList + "\n");


        System.out.println("Ninth  task:");
        var maxAgePeople = people
                .stream()
                .max(Comparator.comparing(People::getAge));

        System.out.println(maxAgePeople + "\n");

        System.out.println("Tenth  task:");
        var minAgePeople = people
                .stream()
                .min(Comparator.comparing(People::getAge));

        System.out.println(minAgePeople + "\n");


    }




}




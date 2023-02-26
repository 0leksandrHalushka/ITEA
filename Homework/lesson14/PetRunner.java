package lesson14;

import java.util.HashMap;
import java.util.Map;

public class PetRunner {
    public static void main(String[] args) {


        HashMap<String, Pet> petHashMap = new HashMap<>();

        Cat cat = new Cat("Vaska", 4);
        Dog dog = new Dog("Jack", 4);
        Parrot parrot = new Parrot("Kesha", 2);

        petHashMap.put(cat.getName(), cat);
        petHashMap.put(dog.getName(), dog);
        petHashMap.put(parrot.getName(), parrot);

        new Pet().showPets(petHashMap);


    }

}

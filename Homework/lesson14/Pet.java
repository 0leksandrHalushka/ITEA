package lesson14;

import java.util.HashMap;

public class Pet {

    public Pet() {
    }

    public String name;
    public int legs;

    public Pet(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void showPets(HashMap<String, Pet> petHashMap){
        for (String key: petHashMap.keySet()) {
            System.out.println(key);
        }

    }

}

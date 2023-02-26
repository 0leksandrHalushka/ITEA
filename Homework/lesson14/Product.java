package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Product {
    HashMap<Integer, String> toys = new HashMap<>();

    public static void main(String[] args) {

        Product product = new Product();

        product.toys.put(1110, "Teddy bear");
        product.toys.put(720, "Lego bricks");
        product.toys.put(374, "Model car");
        product.toys.put(597, "Play kitchen");
        product.toys.put(984, "Barbie doll");

        product.printEntrySet();
        product.printKeySet();
        product.printValue();
    }


    public void printEntrySet () {

        for (Map.Entry<Integer, String> product:toys.entrySet()) {
            System.out.println(product);
        }
    }
    public void printKeySet(){
        for (Integer key:toys.keySet()) {
            System.out.println("Key = " + key);
        }

    }

    public void printValue(){
        for (String value: toys.values()) {
            System.out.println(value);
        }

    }

}

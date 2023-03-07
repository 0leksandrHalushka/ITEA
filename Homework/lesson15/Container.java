package lesson15;

import java.util.*;

public class Container {

    private final int containerWeight = 15;
    private volatile int weight;

    public int getWeight() {
        return weight;
    }

    List productsInContainer = new ArrayList();

    public List fillContainer (){
        while (weight < containerWeight) {
            int random = new Random().nextInt(2);

            if ((random == 1) && (weight < (100 - Products.METAL.getWeight()))) {
                productsInContainer.add(Products.CONSTRUCTION);
                weight += Products.CONSTRUCTION.getWeight();
            } else {
                productsInContainer.add(Products.METAL);
                weight += Products.METAL.getWeight();
            }

        }

        return productsInContainer;
    }


    @Override
    public String toString() {
        return "Container{" +
                "containerWeight=" + containerWeight +
                ", weight=" + weight +
                ", productsInContainer=" + productsInContainer +
                '}' + "\n";
    }
}

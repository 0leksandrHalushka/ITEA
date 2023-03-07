package lesson15;

import java.util.*;

public class Train {

    private final int trainPlatforms = 3;
    private int weightInTrain;

     List train = new ArrayList();

    Container container = new Container();

    Factory factory = new Factory();



    public List fillTrain (){
        for (int i = 0; i < trainPlatforms; i++) {
            train.add(new Container().fillContainer());
            weightInTrain = weightInTrain + container.getWeight();
        }
        return train;
    }

    public List fillTrainFromFactory(){
        for (int i = 0; i < trainPlatforms; i++) {
            train = factory.storage.subList(0, factory.storage.size());
        }

        return train;
    }


    public List removeContainersFromTrain (){
        if (!train.isEmpty()) {
                train.clear();
        }
        return train;
    }


    @Override
    public String toString() {
        return "Train{" +
                "containers=" + train +
                '}' + "";
    }
}

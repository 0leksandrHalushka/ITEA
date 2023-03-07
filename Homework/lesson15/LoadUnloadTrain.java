package lesson15;

import java.util.*;

public class LoadUnloadTrain extends Thread {
        Train train = new Train();
        Factory factory = new Factory();

    int i = 0;
        @Override
        public void run(){
            while (i < factory.storageCapacity) {
                factory.storage.add(train.fillTrain());
                System.out.println(factory.storage + "\n");
                i++;
                train.removeContainersFromTrain();
            }

        }

}

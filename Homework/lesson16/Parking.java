package lesson16;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Parking {
    private final BlockingQueue<Integer> availableSpaces;
    private final AtomicInteger parkedCarsCount;

    public Parking(int numberOfSpaces) {
        availableSpaces = new ArrayBlockingQueue<>(numberOfSpaces, true);
        for (int i = 0; i < numberOfSpaces; i++) {
            availableSpaces.offer(i);
        }
        parkedCarsCount = new AtomicInteger(0);
    }

    public int park() {
        Integer parkingSpace;
        try {
           parkingSpace = availableSpaces.poll(5, TimeUnit.SECONDS);
            if (parkingSpace == null) {
                throw new RuntimeException("Очікування вільного паркувального місця");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException("Помилка при очікуванні вільного місця", e);
        }
        parkedCarsCount.incrementAndGet();
        return parkingSpace;
    }

    public void leaveParking(int parkingSpace) {
        if (availableSpaces.offer(parkingSpace)) {
            parkedCarsCount.decrementAndGet();
        }
    }


}


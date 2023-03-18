package lesson16;

public class Runner {
    public static void main(String[] args) {

        Parking parking = new Parking(2);

        Car car1 = new Car(parking, "Машина 1");
        Car car2 = new Car(parking,  "Машина 2");
        Car car3 = new Car(parking, "Машина 3");
        Car car4 = new Car(parking, "Машина 4");
        Car car5 = new Car(parking, "Машина 5");


        new Thread(() -> {
            car1.run();
            Thread.yield();
        }).start();


        new Thread(() -> {
            car2.run();

            Thread.yield();
        }).start();

        new Thread(() -> {
            car3.run();

            Thread.yield();
        }).start();

        new Thread(() -> {
            car4.run();

            Thread.yield();
        }).start();
        new Thread(() -> {
            car5.run();

            Thread.yield();
        }).start();


    }

}

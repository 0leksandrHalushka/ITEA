package lesson16;

public class Car implements Runnable{
    private final Parking parking;
    private final String name;

    public Car(Parking parking, String name) {
        this.parking = parking;
        this.name = name;
    }

    @Override
    public void run() {
        int parkingSpace;
        while (true) {
            try {
                parkingSpace = parking.park();
                break;
            } catch (RuntimeException e) {
                System.out.println("Очікування вільного паркувального місця");
            }
        }

        try {
            System.out.println(name + " паркується на місці " + parkingSpace);
            Thread.sleep(5000); // парковка машини еа 5
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        parking.leaveParking(parkingSpace);
        System.out.println(name + " покидає парковку");
    }
}

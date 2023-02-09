package lesson9;

public class BlueRayDiscRunner {

    public static void main(String[] args) {

        BlueRayDisc blueRayDisc = new BlueRayDisc("Films");
        blueRayDisc.recordInfo("main catalogue", "fantastic", "Tron: Legacy");
        System.out.println(blueRayDisc);
        blueRayDisc.recordInfo("main catalogue", "cartoons", "Toy Story");
        System.out.println(blueRayDisc);

    }

}

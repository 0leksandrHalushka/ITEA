package lesson9;

public class EuropeRunner {
    public static void main(String[] args) {
        Europe europe = new Europe();
        europe.run("Germany", "Province of Posen", "-");
        System.out.println(europe);

        europe.run("Polish","Province of Posen", "+" );
        System.out.println(europe);

    }

}

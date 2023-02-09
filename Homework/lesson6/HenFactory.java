package lesson6;

public class HenFactory {
    Hen ukrainianHen = null;
    Hen polishHen = null;
    Hen greatBritainHen = null;
    Hen MoldovanHen = null;
    public void getHen() {
        ukrainianHen = new UkrainianHen();
        polishHen = new PolishHen();
        greatBritainHen = new GreatBritainHen();
        MoldovanHen = new MoldovanHen();

        System.out.println(ukrainianHen.getDescription());
        System.out.println(polishHen.getDescription());
        System.out.println(greatBritainHen.getDescription());
        System.out.println(MoldovanHen.getDescription());

    }
    public static void main(String[] args) {
        HenFactory factory = new HenFactory();
        factory.getHen();
    }
}

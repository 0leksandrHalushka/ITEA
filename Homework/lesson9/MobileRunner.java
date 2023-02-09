package lesson9;

public class MobileRunner {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        mobile.setModel("POCO X3");
        mobile.info(175,6, 128, 6.5, "IPS");
        System.out.println(mobile);

    }

}

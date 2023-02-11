package lesson9;

public class CityRunner {

    public static void main(String[] args) {

        City city = new City();
        city.setCityName("Kharkiv");
        city.info("Sumska Street");
        System.out.println(city);

        city.setCityName("Kharkiv");
        city.info("Sumska Street 10", "Gagarin Avenue 15");
        System.out.println(city);

        city.setCityName("Kharkiv");
        city.info("Sumska Street 10", "Gagarin Avenue 15", "Freedom Square");
        System.out.println(city);

    }
}

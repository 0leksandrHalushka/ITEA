package lesson9;

public class CatalogRunner {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.setBookName("The Lord of the Rings");
        catalog.createBookInfo("user 1");
        System.out.println(catalog);


        catalog.createBookInfo(null);
        System.out.println(catalog);

    }
}

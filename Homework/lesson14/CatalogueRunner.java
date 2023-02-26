package lesson14;

import java.util.*;

public class CatalogueRunner {

    public static void main(String[] args) {

        Catalogue catalogue = new Catalogue();
        ArrayList<Catalogue> product = new ArrayList<>();

        Catalogue sweater = new Catalogue("Sweater", 450, 4.5f);
        Catalogue socks = new Catalogue("Socks", 30, 3.5f);
        Catalogue pants = new Catalogue("Pants", 40, 5f);

        product.add(socks);
        product.add(pants);
        product.add(sweater);

        catalogue.sortByName(product);
        catalogue.sortByPrice(product);
        catalogue.sortByRating(product);

    }

}

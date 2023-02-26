package lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Catalogue{

    private String productName;
    private float productPrice;
    private float productRating;


    public Catalogue() {
    }

    public String getProductName() {
        return productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public float getProductRating() {
        return productRating;
    }

    public Catalogue(String productName, float productPrice, float productRating) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }


    @Override
    public String toString() {
        return "Catalogue{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productRating=" + productRating +
                '}';
    }


    public void sortByName(ArrayList<Catalogue> product){

        Collections.sort(product, Comparator.comparing(Catalogue::getProductName));
        for (Catalogue prod: product) {
            System.out.println(prod);
        }
        System.out.println();
    }

    public void sortByPrice(ArrayList<Catalogue> product){
        Collections.sort(product, Comparator.comparing(Catalogue::getProductPrice));
        for (Catalogue prod: product) {
            System.out.println(prod);
        }
        System.out.println();
    }


    public void sortByRating(ArrayList<Catalogue> product){
        Collections.sort(product, Comparator.comparing(Catalogue::getProductRating));
        for (Catalogue prod: product) {
            System.out.println(prod);
        }
        System.out.println();
    }


}

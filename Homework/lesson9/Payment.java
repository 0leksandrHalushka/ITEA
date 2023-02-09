package lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Payment {

    private String listName;
    private ShoppingList shoppingList;
    private int numbersProductInList;

    class ShoppingList {
        private String productName;
        private double productQuantity;
        private String [] record() {
            enterNum();
            String note [] = new String [numbersProductInList];
            for (int i = 0; i < numbersProductInList; i++) {
                productName = enterProductName();
                productQuantity = enterProductQuantity();
                note[i] = toString();
            }
            return note;
        }

        private String enterProductName(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter product name:");
            String productName = scanner.nextLine();
            return productName;
        }

        private double enterProductQuantity(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter product quantity:");
            double productQuantity = scanner.nextDouble();
            return productQuantity;

        }
        @Override
        public String toString(){
            return "List name: " + listName + " | Product name " +  productName + " | Product quantity " + productQuantity + "\n";
        }


    }

    private int enterNum (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of record in product list:");
        this.numbersProductInList = scanner.nextInt();
        return numbersProductInList;
    }

    private String enterListName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list name:");
        this.listName = scanner.nextLine();
        return listName;
    }


    public void run(){
        shoppingList = new ShoppingList();
        enterListName();
        for (String el: shoppingList.record()) {
            System.out.println(el);
        }

    }


}


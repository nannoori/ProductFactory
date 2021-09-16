package com.pro.org;

public class MainApp {
    public static void main(String[] args) {

        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.makeProduct("productOne");
        if (product instanceof ProductOne) {
            System.out.println("productOne is created");
        }
            Product product1 = productFactory.makeProduct("productTwo");
            if (product1 instanceof ProductTwo) {
                System.out.println("productTwo is created");
        }
    }
}

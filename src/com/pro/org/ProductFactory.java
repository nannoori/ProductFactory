package com.pro.org;

public class ProductFactory implements Factory {

    @Override
    public Product makeProduct(String productType) {
        if (productType.equalsIgnoreCase("ProductOne"))
            return new ProductOne();
        if (productType.equalsIgnoreCase("ProductTwo"))
            return new ProductTwo();
        return null;
    }
}

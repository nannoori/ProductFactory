package com.pro.org;

public abstract class Product {
    private Integer productId;
    private String prodName;

    public Product() {
        System.out.println("default constructor called");
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProdName() {
        return prodName;
    }

    public Product setProdName(String prodName) {
        this.prodName = prodName;
        return null;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}

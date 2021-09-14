package nl.oose.dea.streams;

import static nl.oose.dea.streams.ProductCategory.GADGETS;

public class Product {
    private String name;
    private int price;
    private ProductCategory category;

    public Product(String name, int price) {
        this(name, price, GADGETS);
    }

    public Product(String name, int price, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice() {
        this.price++;
    }

    public ProductCategory getCategory() { return category; }

    public void printPrice() {
        System.out.println(this.price);
    }
}

package Amin.A3;

public class Product {
    String name;
    int quantity;
    double pricePerUnit;
    double taxPercentage;

    public Product(String name, int quantity, double pricePerUnit, double taxPercentage) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.taxPercentage = taxPercentage;
    }
}

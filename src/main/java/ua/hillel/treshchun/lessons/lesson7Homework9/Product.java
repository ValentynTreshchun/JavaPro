package ua.hillel.treshchun.lessons.lesson7Homework9;

public class Product {
    private String type;
    private double price;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "type: \'" + type + '\'' +
                ", price: " + price +
                '}';
    }
}

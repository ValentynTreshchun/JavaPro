package ua.hillel.treshchun.lessons.lesson7Homework9;

public class DiscountedProduct extends Product{
    private double discount;

    public DiscountedProduct(String type, int price, double discount) {
        super(type, price);
        if (discount < 1) {
            this.discount = discount;
        } else if (discount >= 1 && discount < 100) {
            this.discount = discount/100;
        } else {
            this.discount = 1;
        }
    }

    public double getDiscount() {
        return discount;
    }
    @Override
    public double getPrice() {
        return super.getPrice() * (1 - discount);
    }

    @Override
    public String toString() {
        return "\nDP{" +
                "\'" + super.getType() + "\'" +
                ", list: " +super.getPrice() +
                ", discount: " + discount +
                ", cost: " + this.getPrice() +
                '}';
    }
}

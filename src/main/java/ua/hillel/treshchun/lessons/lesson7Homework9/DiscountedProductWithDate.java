package ua.hillel.treshchun.lessons.lesson7Homework9;

import java.time.LocalDateTime;

public class DiscountedProductWithDate extends DiscountedProduct {
    LocalDateTime timeCreated;

    public DiscountedProductWithDate(String type, int price, double discount) {
        super(type, price, discount);
        timeCreated = LocalDateTime.now();
    }

    public LocalDateTime getDate() {
        return timeCreated;
    }

    @Override
    public String toString() {
        return "\nDPD{" +
                "\'" + super.getType() + "\'" +
                ", list: " + super.getPrice() +
                ", discount: " + super.getDiscount() +
                ", timeCreated: " + timeCreated +
                '}';
    }
}

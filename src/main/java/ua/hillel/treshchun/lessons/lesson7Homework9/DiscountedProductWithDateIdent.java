package ua.hillel.treshchun.lessons.lesson7Homework9;

public class DiscountedProductWithDateIdent extends DiscountedProductWithDate {
    private double identNum;

    public DiscountedProductWithDateIdent(String type, int price, double discount, double identNum) {
        super(type, price, discount);
        this.identNum = identNum;
    }

    public double getIdentNum() {
        return identNum;
    }

    @Override
    public String toString() {
        return "DiscountedProductWithDateIdent{" +
                super.toString() +
                "identNum=" + identNum +
                '}';
    }
}

package ua.hillel.treshchun.lessons.lesson4Homework6.ShapeImpl;

import ua.hillel.treshchun.lessons.lesson4Homework6.GeometricShape;

public class Square implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    public double SurfaceArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}

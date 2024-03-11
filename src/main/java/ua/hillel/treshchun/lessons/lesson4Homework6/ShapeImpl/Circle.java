package ua.hillel.treshchun.lessons.lesson4Homework6.ShapeImpl;

import ua.hillel.treshchun.lessons.lesson4Homework6.GeometricShape;

public class Circle implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double SurfaceArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

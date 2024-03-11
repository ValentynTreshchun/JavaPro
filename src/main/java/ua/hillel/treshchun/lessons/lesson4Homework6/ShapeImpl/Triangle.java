package ua.hillel.treshchun.lessons.lesson4Homework6.ShapeImpl;

import ua.hillel.treshchun.lessons.lesson4Homework6.GeometricShape;

public class Triangle implements GeometricShape {
    double sideA;
    double sideB;
    double angleAB;

    public Triangle(double sideA, double sideB, double angleAB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAB = angleAB;
    }

    @Override
    public double SurfaceArea() {
        return 0.5 * sideA * sideB * Math.sin(angleAB);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", angleAB=" + angleAB +
                '}';
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getAngleAB() {
        return angleAB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setAngleAB(double angleAB) {
        this.angleAB = angleAB;
    }
}

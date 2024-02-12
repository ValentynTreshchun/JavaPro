package ua.hillel.treshchun.lessons.lesson2Homework.Package2;

public class SameName {
    private double distance;
    private boolean isFar;

    public SameName(double distance, boolean isFar) {
        this.distance = distance;
        this.isFar = isFar;
    }

    public double getDistance() {
        return distance;
    }

    public void setTitle(boolean isFar) {
        this.isFar = isFar;
    }

    @Override
    public String toString() {
        return "SameName{" +
                "distance=" + distance +
                ", Far? ='" + isFar + '\'' +
                '}';
    }
}

package ua.hillel.treshchun.lessons.lesson3Homework5;

public class Animals {
    String name;

    public Animals(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void run(int distance) {
        if (distance >= 0 ) {
            System.out.println("Animal \'" + name + "\' ran " + distance + "m");
        } else {
            System.out.println("Negative distance provided");
        }
    }
    public void swim(int distance) {
        if (distance >= 0 ) {
            System.out.println("Animal \'" + name + "\' swum " + distance + "m");
        } else {
            System.out.println("Negative distance provided");
        }
    }

}

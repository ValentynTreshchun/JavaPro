package ua.hillel.treshchun.lessons.lesson3Homework2;

public class Dog extends Animals{

    private final int runMax = 500;
    private final int swimMax = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 0) {
            if (distance > runMax) {
                System.out.println("Dog \'" + name + "\' ran " + runMax + "m and stopped");
            } else {
                System.out.println("Dog \'" + name + "\' ran " + distance + "m");
            }
        } else {
            System.out.println("Negative distance provided");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 0) {
            if (distance > swimMax) {
                System.out.println("Dog swum " + swimMax + "m and drowned");
            } else {
                System.out.println("Dog swum " + distance + "m");
            }
        } else {
            System.out.println("Negative distance provided");
        }
    }
}

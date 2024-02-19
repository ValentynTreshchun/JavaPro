package ua.hillel.treshchun.lessons.lesson3Homework2;

public class Cat extends Animals{
    private final int runMax = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance){
        if (distance > 0) {
            if (distance > runMax) {
                System.out.println("Cat \"" + name + "\" ran " + runMax + "m and stopped");
            } else {
                System.out.println("Cat \"" + name + "\" ran " + distance + "m");
            }
        } else {
            System.out.println("Negative distance provided");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println("Cat tried to swim " + distance + "m. But cats cannot swim, so it drowned");
    }
}

package ua.hillel.treshchun.lessons.lesson4Homework6.ParticipantImpl;

public abstract class Participant {
    int maxRun;
    int maxJump;
    String name;


    public abstract void run();
    public abstract void jump();

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public String getName() {
        return name;
    }
}

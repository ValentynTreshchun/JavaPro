package ua.hillel.treshchun.lessons.lesson4Homework6.ParticipantImpl;

public class Human extends Participant {
    public Human(int maxDistance, int maxHeight, String name) {
        super.maxRun = maxDistance;
        super.maxJump = maxHeight;
        super.name = name;
    }

    @Override
    public void run() {
        System.out.print("Human \"" + name + "\" is running.. ");
    }

    @Override
    public void jump() {
        System.out.print("Human \"" + name + "\" jumped.. ");
    }
}

package ua.hillel.treshchun.lessons.lesson4Homework6.ParticipantImpl;

import ua.hillel.treshchun.lessons.lesson4Homework6.ObstacleImpl.Obstacle;
import ua.hillel.treshchun.lessons.lesson4Homework6.ObstacleImpl.Treadmill;

public abstract class Participant {
    protected int maxRun;
    protected int maxJump;
    protected String name;


    public abstract void run();
    public abstract void jump();

//    public abstract boolean overcome(Obstacle obstacle);
    public boolean overcome(Obstacle obstacle) {
        int obstacleLength = obstacle.getObstacleLength();
        if (obstacle.getClass() == Treadmill.class) {
            run();
            if (maxRun < obstacleLength) {
                System.out.println(name + " failed the " + obstacleLength + "m Treadmill obstacle");
                return false;
            } else {
                System.out.println(name + " passed the " + obstacleLength + "m Treadmill obstacle");
                return true;
            }
        }
        else {
            jump();
            if (maxJump < obstacleLength) {
                System.out.println(name + " failed the " + obstacleLength + "m Wall obstacle");
                return false;
            } else {
                System.out.println(name + " passed the " + obstacleLength + "m Wall obstacle");
                return true;
            }
        }
    }

    public String getName() {
        return name;
    }
}

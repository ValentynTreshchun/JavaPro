package ua.hillel.treshchun.lessons.lesson4Homework6.ObstacleImpl;

import ua.hillel.treshchun.lessons.lesson4Homework6.Obstacle;
import ua.hillel.treshchun.lessons.lesson4Homework6.ParticipantImpl.Participant;

public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        if (participant.getMaxJump() < height) {
            System.out.println(participant.getName() + " failed the " + height + "m Wall obstacle");
            return false;
        }
        else {
            System.out.println(participant.getName() + " passed the " + height + "m Wall obstacle");
            return true;
        }
    }
}

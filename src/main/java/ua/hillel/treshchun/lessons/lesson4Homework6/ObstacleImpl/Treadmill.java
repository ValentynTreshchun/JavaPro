package ua.hillel.treshchun.lessons.lesson4Homework6.ObstacleImpl;

import ua.hillel.treshchun.lessons.lesson4Homework6.Obstacle;
import ua.hillel.treshchun.lessons.lesson4Homework6.ParticipantImpl.Participant;

public class Treadmill implements Obstacle {
    int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        if (participant.getMaxRun() < distance) {
            System.out.println(participant.getName() + " failed the " + distance + "m Treadmill obstacle");
            return false;
        }
        else {
            System.out.println(participant.getName() + " passed the " + distance + "m Treadmill obstacle");
            return true;
        }
    }
}

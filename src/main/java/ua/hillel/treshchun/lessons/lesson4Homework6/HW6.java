package ua.hillel.treshchun.lessons.lesson4Homework6;

import ua.hillel.treshchun.lessons.lesson4Homework6.ObstacleImpl.Obstacle;
import ua.hillel.treshchun.lessons.lesson4Homework6.ObstacleImpl.Treadmill;
import ua.hillel.treshchun.lessons.lesson4Homework6.ObstacleImpl.Wall;
import ua.hillel.treshchun.lessons.lesson4Homework6.ParticipantImpl.Cat;
import ua.hillel.treshchun.lessons.lesson4Homework6.ParticipantImpl.Human;
import ua.hillel.treshchun.lessons.lesson4Homework6.ParticipantImpl.Participant;
import ua.hillel.treshchun.lessons.lesson4Homework6.ParticipantImpl.Robot;
import ua.hillel.treshchun.lessons.lesson4Homework6.ShapeImpl.Circle;
import ua.hillel.treshchun.lessons.lesson4Homework6.ShapeImpl.Square;
import ua.hillel.treshchun.lessons.lesson4Homework6.ShapeImpl.Triangle;

import java.util.Arrays;

public class HW6 {
    public static void main(String[] args) {
        HW6 hw6 = new HW6();
        GeometricShape [] geometricShapes = {
                new Circle(0.5),
                new Square(0.5),
                new Triangle(0.3,0.4, 90)
        };
        System.out.println(Arrays.toString(geometricShapes));
        System.out.println("Total surface are of shapes = " + hw6.surfaceOfShapesArray(geometricShapes));

        Participant [] participants = {
                new Cat(50, 2,"Cat"),
                new Human(100, 2, "Bob"),
                new Robot(1000, 4, "Ben")
        };
        Obstacle[] obstacles = {
                new Treadmill(50),
                new Treadmill(200),
                new Wall(1),
                new Wall(3)
        };

        hw6.contest(participants, obstacles);
    }

    private double surfaceOfShapesArray(GeometricShape [] shapes){
        double surfaceArea = 0;
        for (GeometricShape shape:shapes
             ) {
            surfaceArea += shape.SurfaceArea();
        }
        return surfaceArea;
    }

    private void contest (Participant [] participants, Obstacle [] obstacles){
        for (Participant participant:participants
             ) {
            System.out.println();
            for (Obstacle obstacle:obstacles
                 ) {
                if (!participant.overcome(obstacle)) {
                    break;
                }
            }
        }
    }
}

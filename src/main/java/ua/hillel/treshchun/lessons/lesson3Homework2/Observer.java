package ua.hillel.treshchun.lessons.lesson3Homework2;

import java.util.List;

public interface Observer {
    void handleEvent(List<Animals> animalsList, boolean animalAdded);
}

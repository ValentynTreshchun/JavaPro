package ua.hillel.treshchun.lessons.lesson3Homework5;

import java.util.List;

public class AnimalCounter implements Observer{
    private int counter;

    public AnimalCounter() {
        counter = 0;
    }

    @Override
    public void handleEvent(List<Animals> animalsList, boolean animalAdded) {
        if (animalAdded) {
            counter++;
            System.out.println("Animal added. Animals list: " + animalsList + " Total: " + counter);
        } else {
            counter--;
            System.out.println("Animal removed. Animals list: " + animalsList + " Total: " + counter);
        }
    }

    public int getCounter() {
        return counter;
    }
}

package ua.hillel.treshchun.lessons.lesson3Homework5;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    int animalCounter;
    List<Animals> animalsList = new ArrayList<>();

    public Zoo() {
        animalCounter = 0;
    }

    public void addAnimal(String name){
        animalsList.add(new Animals(name));
        handleEvent(true);
    }

    public void addCat(String name){
        animalsList.add(new Cat(name));
        handleEvent(true);
    }

    public void addDog(String name){
        animalsList.add(new Dog(name));
        handleEvent(true);
    }

    public void rmAnimal(String name){
        for (Animals animal: animalsList
             ) {
            if (animal.name.equals(name)){
                animalsList.remove(animal);
                handleEvent(false);
                break;
            }
        }
    }

    public void handleEvent(boolean animalAdded) {
        if (animalAdded) {
            animalCounter++;
            System.out.println("Animal added. Animals list: " + animalsList + " Total: " + animalCounter);
        } else {
            animalCounter--;
            System.out.println("Animal removed. Animals list: " + animalsList + " Total: " + animalCounter);
        }
    }
}

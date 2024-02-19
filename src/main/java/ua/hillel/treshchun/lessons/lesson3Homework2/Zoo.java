package ua.hillel.treshchun.lessons.lesson3Homework2;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Observed{

    AnimalCounter animalsCounter = new AnimalCounter();
    List<Animals> animalsList = new ArrayList<>();

    @Override
    public void notifyObserver(boolean animalAdded) {
        animalsCounter.handleEvent(animalsList, animalAdded);
    }

    public void addAnimal(String name){
        animalsList.add(new Animals(name));
        notifyObserver(true);
    }

    public void addCat(String name){
        animalsList.add(new Cat(name));
        notifyObserver(true);
    }

    public void addDog(String name){
        animalsList.add(new Dog(name));
        notifyObserver(true);
    }

    public void rmAnimal(String name){
        for (Animals animal: animalsList
             ) {
            if (animal.name.equals(name)){
                animalsList.remove(animal);
                notifyObserver(false);
                break;
            }
        }
    }
}

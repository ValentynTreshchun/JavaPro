package ua.hillel.treshchun.lessons.lesson3Homework5;

public class main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal("Generic animal");
        zoo.addCat("Norbert");
        zoo.addDog("Max");

        zoo.animalsList.get(0).run(100);
        zoo.animalsList.get(0).swim(100);

        zoo.animalsList.get(1).run(150);
        zoo.animalsList.get(1).run(201);
        zoo.animalsList.get(1).swim(100);

        zoo.animalsList.get(2).run(400);
        zoo.animalsList.get(2).run(501);
        zoo.animalsList.get(2).swim(5);
        zoo.animalsList.get(2).swim(100);

        zoo.rmAnimal("Generic animal");
        zoo.rmAnimal("Norbert");
        zoo.rmAnimal("Max");
        zoo.rmAnimal("Patron");
    }
}

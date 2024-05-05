package ua.hillel.treshchun.lessons.lesson15HW17Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> boxContents;
    private final Class<T> typeParameterClass;

    public Box(Class<T> typeParameterClass) {
        this.boxContents = new ArrayList<>();
        this.typeParameterClass = typeParameterClass;
    }

    public void addFruit(T fruit) {
        boxContents.add(fruit);
    }

    public void addFruit(T[] fruits) {
        boxContents.addAll(Arrays.asList(fruits));
    }

    public double getWeight() {
        if (!boxContents.isEmpty()) {
            return boxContents.size() * boxContents.get(0).getWeight();
        } else throw new RuntimeException("Box is empty");
    }

    public boolean compare(Box box) {
        return box.getWeight() == this.getWeight();
    }

    public void merge(Box<T> box) {
        boxContents.addAll(box.getBoxContents());
    }

    public List<T> getBoxContents() {
        return boxContents;
    }

    @Override
    public String toString() {
        return "Box of " + typeParameterClass.getSimpleName() + "s (" + boxContents.size() + " pc)";
    }
}

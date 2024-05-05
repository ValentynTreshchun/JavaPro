package ua.hillel.treshchun.lessons.lesson15HW17Generics;

import java.util.Arrays;
import java.util.List;

public class HW17 {

    public static void main(String[] args) {
        String[] stringArr = {"line1", "line2", "line3"};
        Integer[] intArr = {4, 2, 7, 5};
        List<String> strList = toList(stringArr);
        List<Integer> intList = toList(intArr);
        System.out.println(strList);
        System.out.println(intList);

        Box<Apple> boxOfApples = new Box<>(Apple.class);
        Box<Orange> boxOfOranges = new Box<>(Orange.class);
        System.out.println(boxOfOranges);
        Apple apple1 = new Apple();
        Apple[] appleArr = {new Apple(), new Apple(), new Apple()};
        Orange orange1 = new Orange();
        Orange[] orangeArr = {new Orange(), new Orange(), new Orange()};

        boxOfApples.addFruit(apple1);
        boxOfApples.addFruit(appleArr);
        boxOfOranges.addFruit(orange1);
        boxOfOranges.addFruit(orangeArr);

        System.out.println("Box of apples weight: " + boxOfApples.getWeight() + "kg");
        System.out.println("Box of oranges weight: " + boxOfOranges.getWeight() + "kg");

        System.out.println(boxOfOranges.compare(boxOfApples));
        System.out.println(boxOfOranges.compare(boxOfOranges));

        Box<Orange> boxOfOranges2 = new Box<>(Orange.class);
        boxOfOranges2.addFruit(new Orange());

        System.out.println(boxOfOranges);
        System.out.println(boxOfOranges2);
        boxOfOranges.merge(boxOfOranges2);
        System.out.println("Merged boxes: " + boxOfOranges);
    }

    private static <T> List<T> toList(T[] array) {
        return Arrays.stream(array).toList();
    }
}

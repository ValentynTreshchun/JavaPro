package ua.hillel.treshchun.lessons.lesson2Homework.Package1;

public class SameName {
    private int age;
    private String name;

    public SameName(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SameName{" +
                "number=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

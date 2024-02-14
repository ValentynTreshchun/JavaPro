package ua.hillel.treshchun.lessons.lesson2Homework;

import ua.hillel.treshchun.lessons.lesson2Homework.Package1.SameName;


public class HW4 {
    public static void main(String[] args) {
        Employee em1 = new Employee("John Doe", "intern", "jd@mail.com","123",24);
        System.out.println("Name: " + em1.getFullName() +
                "\nPosition: " + em1.getPosition() +
                "\nEmail address: " + em1.getEmail() +
                "\nPhone number: " + em1.getPhoneNumber() +
                "\nAge: " + em1.getAge());


        SameName name = new SameName(5, "Doctor");
        ua.hillel.treshchun.lessons.lesson2Homework.Package2.SameName name2 = new ua.hillel.treshchun.lessons.lesson2Homework.Package2.SameName(256, true);
        System.out.println("\n" + name.toString());
        System.out.println(name2.toString());


        Car carDefault = new Car();
        Car car1 = new Car("Car", 5, 15, 50, 12, true);
        carDefault.start();
        car1.start();
    }
}

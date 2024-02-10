package ua.hillel.treshchun.lessons.Lesson1Homework;

import com.sun.tools.javac.Main;

import java.sql.SQLOutput;

public class HomeWorkApp {
    public static void main(String[] args) {
        int year = 2200;
        HomeWorkApp HW1 = new HomeWorkApp();
        HW1.printThreeWords();
        HW1.checkSumSign();
        HW1.printColor();
        HW1.compareNumbers();
        System.out.println(HW1.isNumberWithin10_20(10, 10));
        HW1.isPositiveOrZeroPrint(-18);
        System.out.println(HW1.isNegative(0));
        HW1.printStringNTimes("I'll have a public static final Borsch borsch new Borsch, please.", 3);
        System.out.println("Is " + year + " a leap year? " + HW1.isLeapYear(year));

    }

    private void printThreeWords() {
        System.out.println("Orange\n\nBanana\n\nApple");
    }

    private void checkSumSign() {
        int a = 9;
        int b = -6;
        System.out.println((a + b) > 0 ? "A + B is positive" : "A + B is negative");
    }

    private void printColor() {
        int a = 199;
        if (a > 0) {
            if (a <= 100) {
                System.out.println("Yellow");
            } else {
                System.out.println("Green");
            }
        } else {
            System.out.println("Red");
        }
    }

    private void compareNumbers() {
        int a = 19;
        int b = 27;
        System.out.println((a >= b) ? "A >= B" : "A < B");
    }

    private boolean isNumberWithin10_20(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    private void isPositiveOrZeroPrint(int a) {
        System.out.print("The number is ");
        System.out.println((a >= 0) ? "positive or equals zero" : "negative");
    }

    private boolean isNegative(int a) {
//      in this method 0 is considered a positive number, same as in task 7
//      since boolean can have only two states, 0 has to be included in either positive or negative
        return a < 0;
    }

    private void printStringNTimes (String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
        System.out.println("You idiot, borsch should be private, otherwise everyone can have it.");
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return year % 100 != 0 || year % 400 == 0;
        }
        return false;
    }

}

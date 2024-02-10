package ua.hillel.treshchun.lessons.Lesson1Homework;

public class HomeWorkApp {
    public static void main(String[] args) {
        int year = 2200;
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isNumberWithin10_20(10, 10));
        isPositiveOrZeroPrint(-18);
        System.out.println(isNegative(0));
        printStringNTimes("I'll have a public static final Borsch borsch new Borsch, please.", 3);
        System.out.println("Year " + year + " is a leap year? " + isLeapYear(year));

    }

//    task 2
    public static void printThreeWords() {
        System.out.println("Orange\n\nBanana\n\nApple");
    }

//    task 3
    public static void checkSumSign() {
        int a = 5;
        int b = -6;
        if ((a + b) >= 0) {
            System.out.println("The sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

//    task 4
    public static void printColor() {
        int a = 101;
        if (a <= 0) {
            System.out.println("Red");
        } else if (0 < a && a <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

//    task 5
    public static void compareNumbers() {
        int a = 19;
        int b = 27;
        if (a >= b) {
            System.out.println("A >= B");
        } else {
            System.out.println("A < B");
        }
    }

//    task 6
    public static boolean isNumberWithin10_20(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

//    task 7
    public static void isPositiveOrZeroPrint(int a) {
        if (a >= 0) {
            System.out.println("The number is positive, or equals 0");
        } else {
            System.out.println("The number is negative");
        }
    }

//    task 8
    public static boolean isNegative(int a) {
//      in this method 0 is considered a positive number, same as in task 7
//      since boolean can have only two states, 0 has to be included in either positive or negative
        return a < 0;
    }

//    task 9
    public static void printStringNTimes (String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

//    task 10
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }

}

package ua.hillel.treshchun.lessons.lesson5Homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        HW7 hw7 = new HW7();
        List<String> listOfStrings = new ArrayList<>();
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number of strings delimited by a space: ");
        while (true){
            listOfStrings.add(scanner.next());
            if (scanner.hasNext(" ")) break;
        }
        System.out.println(listOfStrings);
    }

    private int countOccurance (List<String> list, String str){
        return 0;
    }

}

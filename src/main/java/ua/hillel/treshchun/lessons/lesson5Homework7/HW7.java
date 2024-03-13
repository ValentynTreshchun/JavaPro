package ua.hillel.treshchun.lessons.lesson5Homework7;

import ua.hillel.treshchun.lessons.lesson5Homework7.phonebook.phoneBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW7 {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>(Occurance.toList("word2", "word3", "word4", "word5", "word6",
                "wordword7", "worwor8", "word1"));
        String lookupString = "word";
        System.out.println(listOfStrings + "\nLookup word: " + lookupString);
        System.out.println("Count of occurrences (once or more per word): " +
                Occurance.countOccurance(listOfStrings, lookupString));

        System.out.println(Occurance.toList("string1", "string2", "string3"));
        System.out.println(Occurance.toList(null));

        List<Integer> unsortedIntegers = new ArrayList<>();
        for (int i = 0; i < 220; i++) {
            unsortedIntegers.add((int) (Math.random() * 10));
        }
        System.out.println(unsortedIntegers);
        System.out.println(Occurance.findUnique(unsortedIntegers));

        List<String> testList = Occurance.toList("word1", "word2", "word2", "word3", "word4",
                "word1", "word2", "word5", "word1", "wor1");

        Occurance.countOccurances(testList);

        System.out.println(Occurance.findOccurance(testList));

        phoneBook book = new phoneBook();
        book.add("Peter", "+3809712456785");
        book.add("Paul", "+3806712456785");
        book.add("Mark", "+3805012456785");
        book.add("Peter", "+3809612456785");
        System.out.println(book.find("Peter"));
        System.out.println(book.find("Paul"));
        System.out.println(book.find("John"));
        System.out.println(book.findAll("Peter"));
        System.out.println(book.findAll("John"));
    }

}

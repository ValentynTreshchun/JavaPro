package ua.hillel.treshchun.lessons.lesson5Homework7;

import ua.hillel.treshchun.lessons.lesson5Homework7.phonebook.phoneBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW7 {
    public static void main(String[] args) {
        HW7 hw7 = new HW7();
        List<String> listOfStrings = new ArrayList<>(hw7.toList("word2", "word3", "word4", "word5", "word6",
                "wordword7", "worwor8", "word1"));
        String lookupString = "word";
        System.out.println(listOfStrings + "\nLookup word: " + lookupString);
        System.out.println("Count of occurrences (once or more per word): " +
                hw7.countOccurance(listOfStrings, lookupString));

        System.out.println(hw7.toList("string1", "string2", "string3"));
        System.out.println(hw7.toList(null));

        List<Integer> unsortedIntegers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            unsortedIntegers.add((int) (Math.random() * 10));
        }
        System.out.println(unsortedIntegers);
        System.out.println(hw7.findUnique(unsortedIntegers));

        hw7.countOccurance(hw7.toList("word1", "word2", "word2", "word3", "word4", "word1", "word2",
                "word5", "word1", "wor1"));

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

    private int countOccurance(List<String> listOfStrings, String lookupString) {
        int countOccur = 0;
        Iterator<String> iter = listOfStrings.iterator();
        while (iter.hasNext()) {
            if (iter.next().contains(lookupString)) {
                countOccur++;
            }
        }
        return countOccur;
    }

    private List<String> toList(String... inputString) {
        List<String> list = new ArrayList<>();
        if (inputString == null) return list;
        for (String str : inputString
        ) {
            list.add(str);
        }
        return list;
    }

    private List<Integer> findUnique(List<Integer> inputList) {
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iter1 = inputList.iterator();
        Integer temp;
        while (iter1.hasNext()) {
            Iterator<Integer> iter2 = list.iterator();
            boolean unique = true;
            temp = iter1.next();
            while (iter2.hasNext()) {
                if (temp.equals(iter2.next())) unique = false;
            }
            if (unique) list.add(temp);
        }
        return list;
    }

    private void countOccurance(List<String> inputList) {
        System.out.println(inputList);
        List<String> uniqueList = new ArrayList<>();
        Iterator<String> inputIter = inputList.iterator();
        Iterator<String> uniqueIter;
        String temp;
        while (inputIter.hasNext()) {
            temp = inputIter.next();
            if (!uniqueList.contains(temp)) {
                uniqueList.add(temp);
            }
        }
        uniqueIter = uniqueList.iterator();
        while (uniqueIter.hasNext()) {
            int counter = 0;
            temp = uniqueIter.next();
            System.out.print(temp + ": ");
            inputIter = inputList.iterator();
            while (inputIter.hasNext()) {
                if (temp.equals(inputIter.next())) {
                    counter++;
                }
            }
            System.out.println(counter + " occurances");
        }
    }

}

package ua.hillel.treshchun.lessons.lesson5Homework7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Occurance {

    private String word;
    private int count;

    public Occurance(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "\n{name: "
                + word +
                ", count: " + count +
                '}';
    }

    public static int countOccurance(List<String> listOfStrings, String lookupString) {
        int countOccur = 0;
        Iterator<String> iter = listOfStrings.iterator();
        while (iter.hasNext()) {
            if (iter.next().contains(lookupString)) {
                countOccur++;
            }
        }
        return countOccur;
    }

    public static List<String> toList(String... inputString) {
        List<String> list = new ArrayList<>();
        if (inputString == null) return list;
        for (String str : inputString
        ) {
            list.add(str);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> inputList) {
        List<Integer> result = new ArrayList<>();
        result.add(inputList.get(0));
        inputList.forEach(number -> {
            if (!result.contains(number)){
                result.add(number);
            }
        });
        return result;
    }

    public static List<String> getDistinct(List<String> inputList){
        List<String> uniqueList = new ArrayList<>();
        uniqueList.add(inputList.get(0));
        inputList.forEach(word -> {
            if (!uniqueList.contains(word)) {
                uniqueList.add(word);
            }
        });
        return uniqueList;
    }

    public static void countOccurances(List<String> inputList) {
        List<String> uniqueList = getDistinct(inputList);
        System.out.println(inputList);
        uniqueList.forEach(uniqueWord -> {
            System.out.print(uniqueWord + ": ");
            int [] counter = {0};
            inputList.forEach((word) -> {
                if (uniqueWord.equals(word)) {
                    counter[0]++;
                }
            });
            System.out.println(counter[0] + " occurances");
        });
    }

    public static List<Occurance> findOccurance(List<String> inputList) {
        List<Occurance> result = new ArrayList<>();
        List<String> unique = getDistinct(inputList);

        unique.forEach(uniqueWord -> {
            Occurance temp = new Occurance(uniqueWord, 0);
            inputList.forEach(word -> {
                if (word.equals(uniqueWord)){
                    temp.setCount(temp.getCount() + 1);
                }
            });
            result.add(temp);
        });
        return result;
    }
}

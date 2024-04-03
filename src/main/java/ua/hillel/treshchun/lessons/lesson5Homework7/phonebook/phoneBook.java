package ua.hillel.treshchun.lessons.lesson5Homework7.phonebook;

import java.util.ArrayList;
import java.util.List;

public class phoneBook {
    List<phoneEntry> phoneEntries;

    public phoneBook() {
        phoneEntries = new ArrayList<>();
    }

    public void add(String name, String phoneNumber) {
        phoneEntries.add(new phoneEntry(name, phoneNumber));
    }

    public phoneEntry find(String name) {
        for (phoneEntry temp : phoneEntries) {
            if (name.equals(temp.getName())) {
                return temp;
            }
        }
        return null;
    }

    public List<phoneEntry> findAll(String name) {
        List<phoneEntry> searchResult = new ArrayList<>();
        for (phoneEntry temp : phoneEntries) {
            if (name.equals(temp.getName())) {
                searchResult.add(temp);
            }
        }
        return searchResult.isEmpty() ? null : searchResult;
    }
}

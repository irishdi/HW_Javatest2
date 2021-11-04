package Lesson_4.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private final HashMap<String, List<Integer>> phoneBook = new HashMap<>();

    public void add(String surname, int number) {
        List<Integer> list;
        if(phoneBook.containsKey(surname)) {
           list = phoneBook.get(surname);
        }else{
           list = new ArrayList<>();
        }
        list.add(number);
        phoneBook.put(surname, list);
    }

    public List<Integer> get(String surname) {
    return phoneBook.get(surname);

    }
}


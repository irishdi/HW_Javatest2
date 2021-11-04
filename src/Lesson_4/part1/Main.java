package Lesson_4.part1;

import java.util.*;

public class Main {

    public static void main(String[] args){
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList("Moscow", "London",
                "Roma", "Oslo", "St.Petersburg", "Roma", "Istanbul", "Moscow", "Berlin", "Helsinki", "Tallinn" ));

        System.out.println("Initial array:" + wordsList);
        Set<String> uniqueWords = new HashSet<>(wordsList);
        System.out.println("Unique words:" + uniqueWords);
        System.out.println("Count word frequency:");
        for (String number : uniqueWords){
            System.out.println(number + ":" + Collections.frequency(wordsList, number));
        }

    }
}

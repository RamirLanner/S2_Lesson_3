package Homework_1;

import java.util.*;

public class Main {

    protected static String[] words =
            {
                    "word1", "word2", "word3", "word4", "word5",
                    "word1", "word6", "word7", "word8", "word9",
                    "word7", "word7", "word0", "word5", "word6",
                    "word1", "word9", "word0", "word2", "word3"
            };

    public static void main(String[] args) {

        //for fun, I could create an array of words like a List
        List<String> myList;
        myList = Arrays.asList(words);//массив в коллекцию
        System.out.println(myList.toString());

        //вывод уникальных значений вколлекции
        uniqueValues(myList);

        //подсчет одинаковых слов
        uniqueValuesCounter(myList);

        //для телефоной книги
        YellowPages phonebook = new YellowPages();
        phonebook.add("111111111", "Ivanov");
        phonebook.add("222222222", "Petrov");
        phonebook.add("333333333", "Sidrov");
        phonebook.add("444444444", "Kuznecov");
        phonebook.add("555555555", "Ivanov");
        phonebook.add("666666666", "Ivanov");
        //phonebook.info();
        System.out.println(phonebook.get("Petrov"));
        System.out.println(phonebook.get("Ivanov"));

    }

    private static void uniqueValues(List<String> myList) {
        //вывод уникальных значений вколлекции
        Set<String> mySet = new HashSet<>(myList);
        System.out.println(mySet.toString());
    }

    private static void uniqueValuesCounter(List<String> myList) {
        //подсчет одинаковых слов
        //Данный пример видел в сети раньше, он показался более элегантным
        //я просто не смог сделать по другому
        Map<String, Integer> myMap = new HashMap<>();
        Integer counter;
        for (String s : myList) {
            counter = myMap.get(s);
            myMap.put(s, counter == null ? 1 : ++counter);
        }
        System.out.println(myMap.toString());

        //а это альтернатива, но первый сопоб кажется наиболее удобным
        /*
        Set<String> mySet = new HashSet<>();
        for (String s : myList) {
            mySet.add(s);
        }
        int counter = 0;
        for (String s : mySet) {
            for (String s1 : myList) {
                if(s.equals(s1)) counter++;
            }
            System.out.println(s+" повторяется "+counter+" раз(а)");
            counter = 0;
        }
        */
    }
}



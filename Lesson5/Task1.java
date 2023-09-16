package Lesson5;
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Task1 {
      // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item: map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 128999, bookPhone);
        addNumber("Ivanov", 127897, bookPhone);
        addNumber("Petrov", 50655, bookPhone);
        addNumber("Sidorov", 649977, bookPhone);
        addNumber("Ivanov", 1235909003, bookPhone);
        addNumber("Petrov", 78777797, bookPhone);
        addNumber( "Petrov", 899090, bookPhone);

        printBook(bookPhone);
       }
}


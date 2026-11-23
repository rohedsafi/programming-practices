import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>(); //HashMap is a class that implements the Map interface. It stores key-value pairs and allows for fast retrieval of values based on their keys. 
     //  Map<Integer, String> students = new LinkedHashMap<>();
        students.put(2, "Alice");
        students.put(3, "Bob");
        students.put(1, "John");

        students.forEach((key, value) -> System.out.println(key + " : " + value));

        boolean hasKey = students.containsKey(2);
        System.out.println("Contains key 2: " + hasKey);
        System.out.println("Value for key 2: " + students.get(2));
        System.out.println("Size of map: " + students.size());
        students.remove(3);

    }
}

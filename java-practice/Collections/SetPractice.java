import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
       
      //  Set<String> names = new HashSet<>(); // why HashSet is used here: HashSet is a class that implements the Set interface and does not allow duplicate elements. It is used when you want to store unique elements without any specific order.
      //  Set<Integer> num = new LinkedHashSet<>(); // why LinkedHashSet is used here: LinkedHashSet maintains the insertion order of elements, meaning that when you iterate over the set, the elements will be returned in the order they were added. This is useful when you want to preserve the order of elements while still ensuring that there are no duplicates.
        Set<Integer> num = new TreeSet<>(); // why TreeSet is used here: TreeSet is a class that implements the Set interface and stores elements in a sorted order. It is used when you want to store unique elements in a sorted manner, allowing for efficient retrieval of elements in ascending order.
    //     names.add("Alice");
    //     names.add("Charlie");
    //     names.add("Bob");
    //     names.add("David");
    //     names.add("Alice"); // duplicate value, will not be added
    //     names.forEach(name -> System.out.println(name)); // print the set using forEach loop
    //     // names.remove("Charlie");
    //     names.isEmpty();
    //     names.size();
    //    // names.clear(); // remove all elements from the set
    //     System.out.println(names); // print the set

           num.add(4);
           num.add(1);
           num.add(3);
           num.add(2);
           num.add(4); // duplicate value, will not be added.
           num.forEach(number -> System.out.println(number)); // print the set using forEach loop
           
    }
}

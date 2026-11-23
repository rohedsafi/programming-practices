import java.util.*;

public class ArrayListANDLinkedList {
    public static void main(String[] args) {
    //     ArrayList<String> fruitList = new ArrayList<>();

    //     fruitList.add("Apple");
    //     fruitList.add("Banana");
    //     fruitList.add("");
    //     fruitList.add("BlueBarry");

    // //    String getFruite = fruiteList.get()
    // //    System.out.println("the value in 0 list index is " + getFruite);
    //     System.out.println(fruitList.size());

    //     for(String get : fruitList){
    //         System.out.println(get);
    //     }

        System.out.println("===========================================");

        LinkedList<Integer> myMarks = new LinkedList<>();
        myMarks.add(89);
        myMarks.add(91);
        myMarks.add(95);
        myMarks.add(96);
        myMarks.add(97);
        myMarks.add(98);
        myMarks.add(2 , 93);

        //  some useful methods of ArrayList and LinkedList come on
        myMarks.remove(2);
        // myMarks.removeFirst();
        // myMarks.removeLast();
        // myMarks.clear();
        myMarks.add(100);
        myMarks.get(1); // get method is used to retrieve the value at a specific index
        myMarks.addAll(Arrays.asList(90, 80, 70, 60)); // addAll method is used to add multiple elements to the list
        myMarks.forEach(System.out::println); // forEach method is used to iterate over the list and print the elements
        myMarks.set(0, 99); // set method is used to update the value at a specific index
        myMarks.contains(90); // contains method is used to check if the list contains a specific element
        myMarks.indexOf(80); // indexOf method is used to get the index of a specific element
        myMarks.element(); // element method is used to get the first element of the list
        myMarks.peek(); // peek method is used to get the first element of the list without removing it
        myMarks.poll(); // poll method is used to get and remove the first element of the list
        myMarks.offer(50); // offer method is used to add an element to the end of the list
        myMarks.size(); // size method is used to get the number of elements in the list
        myMarks.isEmpty(); // isEmpty method is used to check if the list is empty
        myMarks.toArray(); // toArray method is used to convert the list to an array
        myMarks.toString(); // toString method is used to convert the list to a string
        myMarks.clone(); // clone method is used to create a shallow copy of the list 
        myMarks.equals(myMarks); // equals method is used to compare two lists for equality
         for(Integer value : myMarks){
            System.out.println(value);
        }
    }
}

import java.util.List;
import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        
      //  List<Integer> myMarks = new ArrayList<>(); // ArrayList is a class that implements the List interface
   
      //  List<Integer> myMarks = new Vector<>(); // Vector is a class that implements the List interface
      
        List<Integer> myMarks = new LinkedList<>(); // LinkedList is a class that implements the List interface

        myMarks.add(89);    
        myMarks.add(90);
        myMarks.add(91);
        myMarks.remove(2);
        myMarks.set(0, 99);
        myMarks.isEmpty();
        myMarks.size();
        System.out.println(myMarks);
    }
}

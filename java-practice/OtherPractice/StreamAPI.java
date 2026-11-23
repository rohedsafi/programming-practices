import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){
        List<Integer> Num = Arrays.asList(2 , 6, 8, 5 , 3, 7 ,4 , 8 , 9 , 1 , 0 , 3);

        List<String> Names = Arrays.asList("Jamal" , "Yousof  " , " Khan");

        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Jamal" , "Yousof  " , " Khan") , Arrays.asList("Ali" , "Ahmed" , "Hassan"));

        
        // Names.stream().map(name -> name.trim().toUpperCase()).forEach(System.out::println); // what is map? // map is used to transform each element of the stream and returns a new stream containing the transformed elements.

        // Num.stream().filter(n -> n % 2 == 0).forEach(System.out::println); // what is filter? // filter is used to select elements based on a predicate and returns a new stream containing only the elements that match the predicate.


       // Num.stream().reduce(0 , (a , b)-> a+b); // what is reduce? // reduce is used to combine the elements of the stream into a single value by repeatedly applying a binary operator.
       // System.out.println(Num.stream().reduce(0 , (a , b)-> a+b)); // what is reduce? // reduce is used to combine the elements of the stream into a single value by repeatedly applying a binary operator.

        // listOfLists.stream().flatMap(Collection::stream).map(name -> name.toLowerCase()).forEach(System.out::println); // what is flatMap? // flatMap is used to flatten a stream of collections into a single stream of elements.

        // Num.stream().sorted().forEach(System.out::println);

        // Num.stream().distinct().sorted().forEach(System.out::println); // what is distinct? // distinct is used to remove duplicate elements from the stream and returns a new stream containing only unique elements.

        // int length = (int) Num.stream().count(); // what is count? // count is used to count the number of elements in the stream and returns a long value.
        // System.out.println("Length of the stream: " + length);

        List<String> S_Names = listOfLists.stream().flatMap(Collection::stream)
        .filter(name -> name.startsWith("S")).collect(Collectors.toList());

        S_Names.forEach(System.out::println);



    }
}

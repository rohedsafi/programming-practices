import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;



public class file_handling_prac {

//     public static <T> void Text(T value){
//         for(T x)
//     }

public static <T> void main(String[] args) {
    
    try {
        BufferedWriter writer = new BufferedWriter (new FileWriter("IO_prac.txt"));
        writer.write("Hi I am Rohed");
        writer.write("This is second line");
        writer.write(129900);
        writer.write(300);
        writer.close();

         BufferedReader reader = new BufferedReader(new FileReader("IO_prac.txt"));
        String value;
        while ((value = reader.readLine()) != null) {
            System.out.println(value);
        }
        reader.close();
        
    } catch (Exception e) {
        // TODO: handle exception
    }
    

}
    
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IO_Stream {
    public static void main(String[] args) {
        String[] names = {"Rohed","Khan","Safi","Ali","Salam"};
        try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\IOstreamPractice.txt" , true));
        writer.write("Hello world\n");
        writer.write("this is second line of code");
        for(String name : names){
            writer.write("\n" + name);
        }
        writer.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\IOstreamPractice.txt" ));
            String Line;
            while ((Line = reader.readLine()) != null) {
                System.out.println("\n" + Line);
                
            }
            reader.close();
          //  System.out.println(reader.readLine());
        } catch (Exception e) {
            e.getStackTrace();
        }
        

       
    }
    
}

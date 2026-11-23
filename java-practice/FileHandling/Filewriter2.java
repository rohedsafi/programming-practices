
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class Filewriter2 {

    public static void main(String[] args) {
      //  int[] name = {66,67,68} ;
        
        try {
        //    // OutputStream writer = new FileOutputStream("hello.txt"); // use for read byte
        //     FileWriter writer = new FileWriter("hello.txt"); //use for read character
        //   //  writer.write(new byte[] {66,67,68}); // byte
        //     writer.write("hello world"); // character
        //     writer.close();
              File f = new File("khan.txt");
              f.createNewFile();
              if (f.createNewFile()) {
                System.out.println("the file is created successfully");
              }else{
                System.out.println("failed to create new file");
              }
               Scanner inp = new Scanner(f);
            // while (inp.hasNextLine()) {
                System.out.println(inp.nextLine());
            // }
             inp.close();

        } catch (Exception e) {
            System.out.println("Exception caught ");
        
        }
        // try{
        //     File file = new File("khan.txt");
        //     Scanner inp = new Scanner(file);
        //     while (inp.hasNextLine()) {
        //         System.out.println(inp.nextLine());
                
        //     }
        //     inp.close();
        // }catch(Exception e){
        //     System.out.println("Exception");
        // }
    } 
    }



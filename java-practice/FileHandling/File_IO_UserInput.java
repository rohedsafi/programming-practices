import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_IO_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter some text :");
            String text = scanner.nextLine();

            FileWriter writer = new FileWriter("User_Input_text.txt" );
            writer.write(text);
            writer.close();
            System.out.println("Data has written to User_Input_text");

            FileReader reader = new FileReader("User_Input_text.txt");
            int get;
            System.out.println("************************");
            System.out.println("****** Data is Reading from file ******");
            
            while((get = reader.read()) != -1){
                System.out.print((char) get );
    
            }
            reader.close(); 

        }catch(IOException e){
            System.out.println("Exception");
        }
        scanner.close();
    }
}

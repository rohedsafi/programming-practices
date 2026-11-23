import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("enter a number :");
            int num = scanner.nextInt();
            System.out.println(num );

            // if (name.matches("[a-zA-Z\\s]+")){
            //     System.out.println(name);
            // }
        } catch (Exception e) {
            System.out.println("enter number, Idiot"); 
        }
        finally{
            scanner.close();
        }
        
        
    }
}
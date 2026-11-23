
import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        System.out.println("Hello, Java ooooo!");
        System.out.println("you");
        System.out.println("are");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
        
    }
}
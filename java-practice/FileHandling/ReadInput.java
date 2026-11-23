import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Reads from System.in

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("Read: " + line);
        }

        scanner.close();
    }
}

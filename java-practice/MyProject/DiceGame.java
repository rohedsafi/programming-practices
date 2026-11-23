// import java.util.Scanner;
// import java.util.Random;
// public class DiesProject {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();
//         int numOFdies;
//         int total;

//         System.out.print("Enter the Number of dice ro roll");
//         numOFdies = scanner.nextInt();

//         // if(numOFdies > 0){
//         //     System.out.println("")
//         // }

//         scanner.close();
//     }
// }
import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numOfDies;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        numOfDies = scanner.nextInt();

        if (numOfDies > 0) {
            System.out.println("Rolling " + numOfDies + " dice...");
            for (int i = 1; i <= numOfDies; i++) {
                int roll = random.nextInt(6) + 1; // Random number 1–6
                System.out.println("Die " + i + ": " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("Please enter a positive number.");
        }

        scanner.close();
    }
}

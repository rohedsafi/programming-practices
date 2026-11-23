import java.util.Scanner;

public class EnhanceSwitch {
    public static void main(String[] args) {

        String day;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week :");
        day = scanner.nextLine();

           switch(day){
            // case "saturday" -> System.out.println("This is weekday 😢");
            // case "sunday" -> System.out.println("This is weekday 😢");
            // case "monday" -> System.out.println("This is weekday 😢");
            // case "tuesday" -> System.out.println("This is weekday 😢");
            // case "wednesday" -> System.out.println("This is weekday 😢");
            // case "thursday" -> System.out.println("This is weekend 😎😍");
            // case "friday" -> System.out.println("This is weekend 😎😍");
            case "saturday","sunday","monday","tuesday","wednesday" -> System.out.println("This is weekday 😢");
            case "thursday","friday" -> System.out.println("This is weekend 😎😍");
            default -> System.out.println(day + " is not day");
        }

        scanner.close();
    }
}

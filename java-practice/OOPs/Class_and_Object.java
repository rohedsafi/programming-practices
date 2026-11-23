import java.util.Scanner;
 class Mobile {

    String name;
    String company;
    int model;
    int price;

}
public class Phone {
    public static void main(String[] args) {
        Mobile M = new Mobile();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter Phone name =");
        M.name = scanner.nextLine();
        System.out.println("ENTER Company name =");
        M.company = scanner.nextLine();
        System.out.println("enter Phone Model name =");
        M.model = scanner.nextInt();
        System.out.println("enter Phone price =");
        M.price = scanner.nextInt();

        System.out.println("Name = " + M.name + "  Company = " + M.company + " Model = " + M.model + " Price = " + M.price);

        scanner.close();

    }

    
}

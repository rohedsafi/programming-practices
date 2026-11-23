import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Foods ;
        int num;
        System.out.print("What # of food do You want :");
        num = scanner.nextInt();
        scanner.nextLine();

        Foods = new String[num];

        for(int i = 0 ; i < Foods.length ; i++){
            System.out.print("enter food name : ");
            Foods[i] = scanner.nextLine();
        }

        for(String food : Foods){
            System.out.println(food);
        }
        scanner.close();
    }
    
}

import java.util.Scanner;
public class BankSystem {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;
        while(isRunning){
        System.out.println("****************");
        System.out.println("  BANK SYSTEM  ");
        System.out.println("****************");
        System.out.println("1: Show Balance");
        System.out.println("2: Deposit Money ");
        System.out.println("3: Withdraw Money");
        System.out.println("4: Exit");
        System.out.println("****************");
        System.out.print("Enter What do you want (1-4):");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> showbalance(balance);
            case 2 -> balance += Deposit();
            case 3 -> balance -= Withdraw(balance);
            case 4 -> isRunning = false;
            default ->System.out.println("invalid number");
            
        }
    }
}
    static void showbalance(double balance){
        System.out.println("********************");
        System.out.printf("Your Balance is $%.2f\n" , balance);
    }

    static double Deposit(){
        double amount;
        System.out.print("Enter Amount of Deposit: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Can't Enter Negative amount");
            return 0;
        }else{
            return amount;
        }
    }

    static double Withdraw(double balance){
        double amount;
        System.out.print("Enter withdraw amount :");
        amount = scanner.nextDouble();
        if(amount == 0){
            System.out.println("Your account is empty");
            return 0;
        }else if(amount > balance){
            System.out.println("Insufficient Amount you have :" + balance);
            return 0;
        }else if(amount < 0){
            System.out.println("Negative amount isn't allowed");
            return 0; 
        }else{
            return amount;
        }

    }
 
}

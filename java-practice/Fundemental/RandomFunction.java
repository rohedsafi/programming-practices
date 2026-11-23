import java.util.Random;
import java.util.Scanner;
public class RandomFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("*** Wellcome To Mastriy Box ***");
        System.out.print("Press the <0> botten and see what you get:");
        int box = scanner.nextInt();
        
        String ch;
        
            if( box == 0 ){
                do{
            int num = random.nextInt(5) + 1;
            if(num == 1 ){
                System.out.println("your Good Guy");
                
            }
            else if(num == 2){
                System.out.println("Your bad Guy");
            
            }
            else if(num == 3){
                System.out.println("your Nice");
                
            }
            else if(num == 4){
                System.out.println("Your Ugly");
                
            }
            else if(num == 5){
                System.out.println("your toxic");
                
            } 
            System.out.print("Enter < 0 y | Y > for run again :");
            ch = scanner.next();
        } while (ch.equals("y") || ch.equals("Y"));
        }else{
            System.out.println("You Press wrong word!");
        }
           
        
        scanner.close();
    }
}

import java.util.Scanner;
class STDgrade{
     static int grade;
    void Grade(){
        
        if (grade >= 90 && grade <= 100){
            System.out.println("Grade A");
        }
        else if (grade >= 80 && grade <= 89){
            System.out.println("Grade b");

        }
        else if (grade >= 70 && grade <= 79){
            System.out.println("Grade c");
            
        }
        else if (grade >= 60 && grade <= 69){
            System.out.println("Grade d");
        
        }
        else {
        System.out.println("your filled");
             }
}
}
public class StudentGrade extends STDgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your marks :");
         grade = scanner.nextInt();
        STDgrade N = new STDgrade();
        N.Grade();
        scanner.close();
    }
}

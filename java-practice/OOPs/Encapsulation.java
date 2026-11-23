import java.util.Scanner;
class School {

    private String Teacher_Name;
    private int Teacher_ID;

    public void setName(){ //set method for accessing private properties 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Teacher Name :");
        Teacher_Name = scanner.nextLine();

        System.out.print("Enter Teacher ID :");
        Teacher_ID = scanner.nextInt();
        
        scanner.close();
    }
    public void getName(){ // get method for printing the value.

        System.out.println("Teacher Name is :" + Teacher_Name);
        System.out.println("Teacher ID is :" + Teacher_ID);
    }
}
public class Encapsulation {

    public static void main(String[] args) {
        School school = new School();
        school.setName();
        school.getName();
    //   school.Teacher_Name = "Rohed"; // Can not access it directly because of Private.
    //    school.getName();
    }
} 
 
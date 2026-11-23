class StudentInfo {
    int Id;
    String name;
    String last_name;
    String subject;
    double Marks;

    StudentInfo(int id, String n, String L){
        Id = id;
        name = n;
        last_name = L;
    }

    StudentInfo(String sub, double m){
        subject = sub;
        Marks = m;
    }
    
    void display(){
        System.out.println(" ID " + Id + "\n Name " + name + 
        "\n Last_Name " + last_name + "\n Subject " + subject + "\n Marks " + Marks);
    }
}
public class ConstructorOverloading {

    public static void main(String[] args) {
        StudentInfo std = new StudentInfo(19100 , "Rohed" , "Khan");
        StudentInfo std1 = new StudentInfo("Math", 93);
        std.display();
        std1.display();
    }
}

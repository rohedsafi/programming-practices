
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    int id;
    String name;
    String semester;
    Student(int id , String name , String semester){
        this.id = id;
        this.name = name;
        this.semester = semester;
    }

     static void printData(Student std) {
        System.out.println("ID: " + std.id);
        System.out.println("Name: " + std.name);
        System.out.println("Semester: " + std.semester);
    }
}



// what is serialization in java? 
// Serialization is the process of converting an object into a byte stream, and deserialization is the reverse process.

public class Serialization {
    public static void main(String[] args) {
        Student std = new Student(121, "Ahmad", "First");
        String filename = "Jan.txt";

    try {
       FileOutputStream fos = new FileOutputStream(filename);
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(std);
       fos.close();
       oos.close();
       System.out.println("the Object is successfully Serialized");
        std.printData(std);

        // std.semester = "Second";
        // std.name = "Ali";        
        
    } catch (Exception e) {
        e.printStackTrace();
    }

    // Deserialization
    try {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student deserializedStd = (Student) ois.readObject();
        fis.close();
        ois.close();
        System.out.println("The Object is successfully Deserialized");
        Student.printData(deserializedStd);
    } catch (Exception e) {
        e.printStackTrace();
    }
        
    }
    
}

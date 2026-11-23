import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class Cars{
    String name;
    String color;

    Cars(String n,String c){
        this.name = n;
        this.color = c;
    }

void get(){
    System.out.println("You drive " + name + " " + color);
}
@Override
public String toString(){
    return "Name "+ name + "  color " + color;

}
}
public class arrayOFobject {
    public static void main(String[] args) {
        try {
            BufferedWriter bWriter = new BufferedWriter(new FileWriter("ArrayOfobject1.txt"));
        Cars[] cars = {new Cars("BMW","Black"),
                       new Cars("Bugatti","Blue"),
                       new Cars("Corolla","white"),
                       new Cars("Ferrari", "orange")};

        for(Cars car : cars){
            bWriter.write(car.toString());
            bWriter.newLine();
        }
         bWriter.close();

        BufferedReader bReader = new BufferedReader(new FileReader("ArrayOfobject1.txt"));
            String line;
            while((line = bReader.readLine()) != null){
                System.out.println(line);
            }
       
        bReader.close();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }

        
    }
}

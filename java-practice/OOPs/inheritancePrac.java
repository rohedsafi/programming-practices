class Grandfather {
    int x = 10;
    void Show(){
        System.out.println("X =" + x);
    }
    
}
 class Father extends Grandfather{
    int y = 20;
    void display(){
        System.out.println("Y + Y =" + y);
    }
}
class Child extends Father{ // We can inherit or access properties and method from base to Multilevel.
    void play(){
        x = 50; // X value changed to 50 
        y = 100; // Y value changed to 100
    System.out.println("X is = " + x);
    System.out.println("Y is = " + y );
    }
}

public class inheritancePrac {
public static void main(String[] args) {
    Child child = new Child();
    child.play();
} 
}


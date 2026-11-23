/*
 *     Abstraction = Used to define abstract classes and methods.
 *                   Abstraction is the process of hiding implementation details 
 *                   and showing only the essential feather;
 *                   Abstract classes CAN'T be instantiated directly.
 *                   CAN contain 'abstract' method (which must be implemented)
 *                   CAN contain 'concrete' method ( which are inherited)
 * 
 */

abstract class Shape {

    abstract double area(); // Abstract Method

    void display(){ // Concrete Method
        System.out.println("this is shape");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
 
    
     double area(){
        return 3.14 * radius * radius;
     }
}
class Rectangle extends Shape{
    double height;
    double weight;
    Rectangle(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    double area(){
        return height * weight;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // using polymorphism
        Shape shape = new Circle(7.5);
        //-----------------------------------------
        Rectangle rectangle = new Rectangle(3.5, 4.5);
        System.out.println("*********************");
        System.out.println("The area of circle is: " + shape.area());
        System.out.println("The area of Rectangle is: " + rectangle.area());
        System.out.println("*********************");
    }
}

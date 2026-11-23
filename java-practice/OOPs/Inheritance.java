class IsAlive{
    boolean alive;
    void Alive(){
        alive = true;
    }
    void Move(){
        System.out.println("this animal is running");
    }
}
class Animal extends IsAlive {
    @Override // method overriding.
    void Move(){
        System.out.println("this animal is swimming");
    }
    void eat(){
        System.out.println("animal is eating!");
    }
}
 class Dog extends Animal{
    int lives = 1;
    void bark(){
        System.out.println("the dog goes *woof*");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        IsAlive isAlive = new IsAlive();
        Animal animal = new Animal();
        Dog d = new Dog();
        isAlive.Move();
        animal.Move();
        d.eat();
        d.bark();
        System.out.println(d.lives);
    }
}

class Animals{
    void Move(){
        System.out.println("this animal is moving");
    }
}
       // method Overriding = when a subclass provides its own 
       //                     implementation of a method that is already defined.
       //                     Allow for code reusability and give specific implementations.
class Dogs extends Animals{
    @Override
    void Move(){ 
        System.out.println("The Dog is running");
    }
}
class Fish extends Animals{
    @Override
    void Move(){
        System.out.println("The Fish is swimming");
    }
    void Bark(){
        System.out.println("The dog is barking");
    }

}
public class MethodOverloading {
    public static void main(String[] args) {
        
        Animals a = new Animals();
        Animals b = new Dogs();
        // Animals c = new Fish();
        a.Move();
        b.Move();
        // c.Move();
    }
}
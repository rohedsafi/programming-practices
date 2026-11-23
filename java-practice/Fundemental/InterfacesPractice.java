/*
 *    Interface = A blueprint for a class that specifies a set of abstract methods
 *                that implementing classes MUST define.
 *                Supports multiple inheritance-like behavior.
 */
interface Pray {
    void flee();
    
}
interface Predator{
    void hunt();

}
 class Rabbit implements Pray{
    @Override
   public void flee(){
        System.out.println("** The Rabbit is running away **");
    }
}
class Tiger implements Predator{
    @Override
    public void hunt(){
        System.out.println("** The Tiger is hunting **");
    }
}
class Fish implements Pray , Predator{
    @Override
    public void flee(){
        System.out.println("** The fish is swimming away **");
    }
    public void hunt(){
        System.out.println("** The fish is hunting **");
    }
}
public class InterfacesPractice {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        Fish fish = new Fish();
        System.out.println("*********************");
        rabbit.flee();
        tiger.hunt();
        System.out.println("-----------------------");
        fish.flee();
        fish.hunt();
        System.out.println("********************");
        
    }
}


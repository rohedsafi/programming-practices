abstract class Animal {
    abstract void sound();
    
}

 class Dog extends Animal {
    @Override
    void sound() {
          System.out.println("the dog goes woof!");
        
    }
}

class Cat extends Animal {

    public Cat(String name, int age) {
        //TODO Auto-generated constructor stub
    }

    @Override
    void sound() {
        System.out.println("the Cat goes Meow!");
    }
}

    
public class AbstracPractice {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        c.sound();
    }
}

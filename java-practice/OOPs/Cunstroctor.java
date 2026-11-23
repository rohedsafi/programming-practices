
 class Car {

    String brand;
    int speed;

    Car(String b,int s){
       this.brand = b;
       this.speed = s;
    }

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class Cunstroctor {
    public static void main(String[] args) {
        
        Car myCar1 = new Car("Ford",80);
        Car myCar2 = new Car("BMW", 140);
        
        myCar1.drive(); 
        myCar2.drive();
    }
}
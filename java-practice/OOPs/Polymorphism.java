  class Math{
    int A (int x , int y){
     return x + y;
    }
    int A(int x,int y, int z){
        return x * y * z;
    }
    double A(double x , double y){
        return x - y;
    }
    String A( String x , String y){
        return x + y;
    }
    
   }
   class B extends Math{
         String A(String x){
            return x;
         }

    }
 public class Polymorphism {
// Method overloading in polymorphism
   public static void main(String[] args) {

    Math math = new Math();
    B b = new B();

    System.out.println("result = " + b.A(30, 40));
    System.out.println("result = " + b.A(2,3,5));
    System.out.println("result = " + math.A(3.33 , 2.11));
    System.out.println("result = " + math.A("Ali" , "Khan"));
    
    System.out.println("B Class result = " + b.A("Abdullah"));

   }
    
}

@FunctionalInterface
 interface A {
    // Abstract method
      public void show();

//     private void display(){
//         System.out.println("this is display method");
//     }

//     static void value(){
//         System.out.println("this is value method");
//     }
//    // this is method is from object class.
//     String toString();

   // repeat Abstract method is not allowed
//    void Name();
}

// first way to access functional Interface
//  class B implements A{
//     @Override
//     public void show(){
//         System.out.println("this is show method");
//     }

//  } 

public class InterfacePractice {
    public static void main(String[] args) {
        try{

            //>>>------ first way------<<<
            //  B b1 = new B();
            //  b1.show();

//  >>--------- Second way -------------<<<
        A a = new A() {
            @Override
            public void show(){
                System.out.println("this is second way of show method");
            }
        };
        a.show();


        // A a1 = () ->{
        //     System.out.println("this is third way"); 
        // };
        // a1.show();

    }catch( NoSuchMethodError nError){
        System.out.println(nError.getMessage());
    }
     

    }
    
}

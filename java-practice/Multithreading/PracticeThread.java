
class X extends Thread {
   
    public void run() 
    {
        for (int i = 0; i < 50; i++) {
            System.out.println("This is Thread Hi");
              try {
               Thread.sleep(1000);
            } catch (Exception e) { System.out.println("Exception happen"); }
        }
    }
}

class Y extends Thread{
    
    public void run()
    {
        for(int i = 0; i < 50 ; i++){
            System.out.println("This is Thread hello");
            try {
               Thread.sleep(1000);
            } catch (Exception e) { System.out.println("Exception happen"); }
        }
    }
}

// class Z extends Thread{
    
//     public void run()
//     {
//         for(int i = 0; i < 50 ; i++){
//             System.out.println("This is Thread world welcome to java");
//                   try {
//                Thread.sleep(100);
//             } catch (Exception e) { System.out.println("Exception happen"); }
//         }
//     }
// }

public class PracticeThread {

  public static void main(String[] args) {
     X x = new X();
    Y y = new Y();
    // Z z = new Z();

    x.start();

    y.start();

    // z.start();
    
  }
}
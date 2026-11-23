import java.util.Scanner;
import java.lang.Runnable;

  class myFoods extends Thread{     // class myRunnable implements Runnable{
    //  String foods;

    //  myFoods(String foods){
    //     this.foods = foods;
    //  }
    public void run(){
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println(i + ") is ready by " + Thread.currentThread().getName());
            try {
                 Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    
    }
    // @Override  // this code is wait for 10 sec and then it shows because it execute in background
    // public void run(){
    //      for(int i =1 ; i <= 10 ; i++){
    //         try {
    //             Thread.sleep(1000);
    //         } catch (Exception e) {
    //             System.out.println("Exceptin happen");
    //         }

    //         if(i == 10){
    //             System.out.println("time's up!");
    //         }
    //     }

    // }
}


public class MultithreadingPra {
    public static void main(String[] args) {
        myFoods t1 = new myFoods();
        // Thread t1 = new Thread(new myFoods());
        // Thread t2 = new myFoods("Kabab");
        // Thread t3 = new myFoods("Roodh");
        t1.start();
        // t2.start();
        // t3.start();





//>>>>---------------- 2: Runnable interface ----------------<<<<
        // Scanner scanner = new Scanner(System.in);
        // Thread m = new Thread(new myRunnable());
        // m.setDaemon(true);
        // m.start();
        // System.out.println("You have 5 sec to enter your name");
        // System.out.print("Enter your name :");
        // String name = scanner.nextLine();
        // System.out.println("Hello " + name);
        // scanner.close();
    }
    
}

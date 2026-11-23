
//     class PrintDemo {
//   // synchronized
//     public void printCount() {
//       try {
//          for(int i = 5; i > 0; i--) {
//             System.out.println("Counter   ---   "  + i );
//          }
//       } catch (Exception e) {
//          System.out.println("Thread  interrupted.");
//       }
//    }
// }

// class ThreadDemo extends Thread {
//    private Thread t;
//    private String threadName;
//    PrintDemo  PD;

//    ThreadDemo( String name,  PrintDemo pd) {
//       threadName = name;
//       PD = pd;
//    }
   
//    public void run() {
//       synchronized (PD){
//          PD.printCount();
//       }
//       System.out.println("Thread " +  threadName + " exiting.");
//    }

//    public void start () {
//       System.out.println("Starting " +  threadName );
//       if (t == null) {
//          t = new Thread (this, threadName);
//          t.start ();
//       }
//    }
// }
class Counter{
    // Shared variable
    private int c = 0; 

    // Synchronized method to increment counter
    public synchronized void increment(){
        c++;    
    }

    // Synchronized method to get counter value
    public int get(){
        return c; 
    }

}


public class ThreadSynchronize {

   public static void main(String args[]) {
      // PrintDemo PD = new PrintDemo();
      // ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
      // ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );

      // T1.start();
      // T2.start();
      // // wait for threads to end
      // try {
      //    T1.join();
      //    T2.join();
      // } catch ( Exception e) {
      //    System.out.println("Interrupted");
      // }

//>>>>-------------------------------------------------------------------------------------------------
        // Shared resource
        Counter Cvalue = new Counter(); 

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                Cvalue.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                Cvalue.increment();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter: " + Cvalue.get());
   }
}


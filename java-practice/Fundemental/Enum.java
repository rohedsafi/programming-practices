
 enum Fruit {
    Orange(9),
    Banana(8),
    Panapple(5);

    int rate;
    Fruit(int rate){
        this.rate = rate;
    }

    int getDisplay(){
        return rate;
    }

    // Sunday,
    // Monday,
    // Tuesday,
    // Wednesday,
    // Thursday,
    // Friday,
    // Saturday,
}

public class Enum {
    public static void main(String[] args) {
    //>>>------------First Example --------------------
        int sum = 0;
        for(Fruit f : Fruit.values() ){
            sum += f.rate;

            System.out.println(f.ordinal()  + ": " + f + " :" + f.getDisplay());
        }
        System.out.println(sum);

    //>>>-------------- Second Example ----------------------
      // Weekdays day = Weekdays.Monday ;
      // switch(day){
      //   case Saturday -> System.out.println("Weekend");
      //   case Sunday -> System.out.println("Weekend");
      //   case Monday -> System.out.println("Weeks day");
      //   case Tuesday -> System.out.println("Weeks day");
      //   case Wednesday -> System.out.println("Weeks day");
      //   case Thursday -> System.out.println("Weeks day");
      //   case Friday -> System.out.println("Weeks day");
      // }
      
    }
    

}

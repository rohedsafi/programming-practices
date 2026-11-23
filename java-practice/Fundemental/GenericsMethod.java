

class Stats<T extends Number> {
  T[] nums;

  // Constructor
  Stats(T[] nums) {
    this.nums = nums;
  }

  // Calculate average
  double sum() {
    double sum = 0;
    for (T num : nums) {
      sum += num.doubleValue();
    }
    return sum ;
  }
}


public class GenericsMethod {

    // public static <T> void PrintValue(T value){
    //     System.out.println(value);
    // }

    // public static void main(String[] args) {
    //     PrintValue("khan");
    // }

//     public static <T> void PrintValue(T [] inputArray){
//         for(T x : inputArray){
//             System.out.println(x);
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         Integer[] intArray = {20,45,50,60};
//         String[] stringArray = {"Khan","Safi","Jamal"};
//         Double[] doubleArray = {80.20 , 4.90 , 10.5};

//         System.out.println("Integer Array :");
//         PrintValue(intArray);

//         System.out.println("String Array :");
//         PrintValue(stringArray);

//         System.out.println("Double Array :");
//         PrintValue(doubleArray);

//     }


  public static void main(String[] args) {
    // Use with Integer
    Integer[] intNums = {10, 20, 30, 40};
    Stats<Integer> intStats = new Stats<>(intNums);
    System.out.println("Integer average: " + intStats.sum());

    // Use with Double
    Double[] doubleNums = {1.5, 2.5, 3.5};
    Stats<Double> doubleStats = new Stats<>(doubleNums);
    System.out.println("Double average: " + doubleStats.sum());
  }
}



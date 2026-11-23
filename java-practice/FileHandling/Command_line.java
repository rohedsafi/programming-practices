public class Command_line {

    public static void main(String[] args) {

    //     if(args.length == 0){
    //     System.out.println("There is not any args yet");
    // }

    // for(int i = 0 ; i < args.length ; i++){
    //     System.out.println("args [" +i+ "]" + args[i]);
    // }

    // int sum = 0;
    // for(String arg : args){
    //     int value = Integer.parseInt(arg);
    //     sum += value;
    // }
    // System.out.println("sum of args :" + sum);

    if (args.length == 0) {
        System.err.println("please, Provide Integer as argument");
    }

    int sum = 0;
    for(String arg : args){
    try {
            int value = Integer.parseInt(arg);
            sum += value;
    }
    catch (NumberFormatException e) {
        System.err.println("Skipping non-integer argument :" + arg);
    }
   }

    System.out.println("sum of arg :" + sum);

  }
}
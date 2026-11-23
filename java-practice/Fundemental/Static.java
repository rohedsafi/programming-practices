 class Friend {
   static int numOFfriend;
    // Static = make a variable or method belong to the class
    // rather then to any specific object.
    // commonly used for utility methods or shared resources.
    String name;

    Friend(String n){
        this.name = n;
        numOFfriend++;
    } 
}
public class Static {

    public static void main(String[] args) {
        Friend f1 = new Friend("khan");
        Friend f2 = new Friend("Ali");
        Friend f3 = new Friend("Omer");
        Friend f4 = new Friend("Ahmad");

        System.out.println(f1.name);
        System.out.println(f2.name);
        System.out.println(f3.name);
        System.out.println(f4.name);
        System.out.println(Friend.numOFfriend); //Access Static member for clearity by Class name
        // System.out.println(f2.numOFfriend);  //Access by object of class
        // System.out.println(f3.numOFfriend);

    }
}

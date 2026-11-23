public class HomeWork {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        System.out.println("------before swapping 1st HomeWork------");
        System.out.println("a = " + a + " b = " + b);

        a = a + b;  // A = 30
        b = a - b; // B = 10
        a = a - b; // A = 20

        System.out.println("-----After swapping------");
        System.out.println("a = " + a + " b = " + b + "\n\n");
        //=================================================================================

        int A = 50;
        int B = 100;
        int C;
        System.out.println("------before swapping 2nd HomeWork------");
        System.out.println("A = " + A + " B = " + B);

        C = A;
        A = B;
        B = C;
        System.out.println("-----After swapping------");
        System.out.println("A = " + A + " B = " + B);

    }
}

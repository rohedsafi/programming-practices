public class Generics_or_Templet {
    
    public static <T> void Simple(T a , T b){
        System.out.println("a =" + a + "\t\t b =" + b);
    }

    public static void main(String[] args){
       Simple("Rohed","Khan");
       Simple(20 , 30);
       Simple(44.50 , 1.80);
       Simple('R', 'S');

    }

    }
 class Mycar {
    int year;
    String model ;
    String color;

    Mycar(int y, String m, String c){
        year = y;
        model = m;
        color = c;
    }
    void showinfo(){
        System.out.println("year " + year + " Model " + model + " color " + color);
    }
    
}

public class Practice {
    public static void main(String[] args) {
        Mycar BMW = new Mycar(2020, "Dragon" , "Whit");
        BMW.showinfo();
    }

    
}

class People {
    String First;
    String Last;
    People(String f , String l){
        this.First = f;
        this.Last = l;
    }
    void showinfo(){
        System.out.println("First Name = " + First + "    Last Name = " + Last  );
    }
    
}
class Ali extends People{
    int money;
    Ali(String f, String l ,int m){
        super(f, l);
        this.money = m;
    }
    void showinfo2(){
        System.out.println(this.First + " Salary is " + this.money );
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Ali ali = new Ali("Rohed", "Khan", 3000);
       ali.showinfo();
       ali.showinfo2();

    }
}
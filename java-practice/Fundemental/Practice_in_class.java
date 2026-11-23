
 interface A {

    void click(); 
}

class detail implements A{
    @Override
    public void click() {
        // TODO Auto-generated method stub
        System.out.println("this is Implementation of abstraction ");
    }
}

public class Practice_in_class {
    public static void main(String[] args) {
        
        detail d = new detail();
        d.click();

    }
}

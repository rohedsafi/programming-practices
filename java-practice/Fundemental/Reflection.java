import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Random{
    String name;
    private String address; 
    private int salary;

    Random(String name , String address , int salary){
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    private int getSalary(){
        return salary;
    }

    private void add(){
        System.out.println("this is sum method");
    }

     void getdisplay(){
        System.out.println("Name :" + name + "  Address :" + address + "  Salary :" + salary);
    }

}

public class Reflection { 
    public static void main(String[] args) {
        Random r = new Random("Ali", "Jalalabad", 35000);

        Field[] field = r.getClass().getDeclaredFields();  // r.getClass()
        for(Field f : field){
            if (f.getName() == "address") {
                try {
                    f.setAccessible(true);
                    // f.set(r, "Kabul");
                    f.set(r , "London");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    r.getdisplay();

//>>>>---------------------- Reflect Method 1 Example ---------------------<<
     Method[] privetMethod = Random.class.getDeclaredMethods();  // r.getClass()
       try{
        for(Method m : privetMethod){
            if (m.getName().equals("getSalary")) {  
                    m.setAccessible(true);  
                    System.out.println(m.invoke(r));
                    // m.invoke(r);
             }
            }
             } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            
        

try{
      Method method = Random.class.getDeclaredMethod("add");
      method.setAccessible(true);
    //   int salary = (int)
      method.invoke(r);
    //   System.out.println("the salary is :" + salary);

}catch(Exception e){
    System.out.println(e.getMessage());
}

    
}
}

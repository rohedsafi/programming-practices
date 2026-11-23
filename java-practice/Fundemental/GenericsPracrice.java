
 class student <T> {
    T value;
    student(T value){
        this.value = value;
    }

    void display(){
        System.out.println("Student name is :" + value);
    }

}

public class GenericsPracrice {

    public static void main(String[] args) {
        student<String> s1 = new student<>("khan");
        s1.display();

        student<Integer> s2 = new student<>(77);
        s2.display();
    }
}

public class GenericsClass {
    public static void main(String[] args) {
        
        Box<String> box1 = new Box<>("Khan");
        box1.printinfo();

        Box<Integer> box2 = new Box<Integer>(20);
        box2.printinfo();

        Box<Double> box3 = new Box<Double>(44.80);
        box3.printinfo();

        Box<Character> box4 = new Box<Character>('R');
        box4.printinfo();
    }
}

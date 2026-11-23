public class conditionalOperator {
    public static void main(String[] args) {
        String name = "";
        System.out.println(name.isEmpty() ? "this isn't valid name" : name);

        int a = 20;
        int b = 80;
        int max = a > b ? a : b;
        System.out.println(max);
    }
}

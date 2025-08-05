public class Question26 {
    public static void demo(int x) {
        x = x + 1;
        System.out.println(x); // prints 6
    }

    public static void main(String[] args) {
        int x = 5;
        demo(x);
        System.out.println(x); // prints 5
    }
}

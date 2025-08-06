public class Question35 {
    public static void f(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b); // prints 5 3
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        f(x, y);
        System.out.println(x + " " + y); // prints 3 5
    }
}

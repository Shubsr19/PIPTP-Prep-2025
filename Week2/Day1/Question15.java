public class Question15 {
    public static void f(double x) {
        if (x < 1)
            return;
        f(x / 2);
        System.out.println(x);
    }

    public static void main(String[] args) {
        f(8);
        // Output:
        // 1.0
        // 2.0
        // 4.0
        // 8.0
    }
}

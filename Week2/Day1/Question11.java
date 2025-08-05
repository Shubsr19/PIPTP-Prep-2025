public class Question11 {
    public static int foo(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        return foo(n - 1) + foo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(foo(4)); // Output: 3
    }
}

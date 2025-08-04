public class Question7 {
    public static int fun(int n) {
        if (n <= 1)
            return n;
        return fun(n - 1) + fun(n - 3);
    }

    public static void main(String[] args) {
        System.out.println(fun(5)); // Output: 1
    }
}

public class Question12 {
    public static int series(int n) {
        if (n == 1)
            return 1;
        return n * series(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(series(5)); // Output: 120
    }
}

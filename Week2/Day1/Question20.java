public class Question20 {
    public static int doubleFactorial(int n) {
        if (n <= 0)
            return 1;
        return n * doubleFactorial(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(doubleFactorial(5)); // Output: 15
    }
}

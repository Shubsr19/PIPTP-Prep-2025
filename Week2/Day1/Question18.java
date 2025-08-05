public class Question18 {
    public static int altSum(int n) {
        if (n == 0)
            return 0;
        return n - altSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(altSum(5)); // Output: 3
    }
}

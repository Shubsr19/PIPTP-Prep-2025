public class Question17 {
    public static void countDown(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        countDown(n - 1);
    }

    public static void main(String[] args) {
        countDown(3); // Output: 3 2 1
    }
}

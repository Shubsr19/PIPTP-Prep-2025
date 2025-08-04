public class Question10 {
    public static void reversePrint(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        reversePrint(n - 1);
    }

    public static void main(String[] args) {
        reversePrint(3); // Output: 3 2 1
    }
}

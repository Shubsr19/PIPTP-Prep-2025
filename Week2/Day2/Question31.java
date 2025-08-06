public class Question31 {
    public static int increment(int x) {
        x = x + 1;
        return x;
    }

    public static void main(String[] args) {
        int a = increment(2); // a = 3
        int b = increment(a); // b = 4
        System.out.println(b); // prints 4
    }
}

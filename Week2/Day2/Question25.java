public class Question25 {
    public static int modify(int x) {
        x = x * 2;
        return x;
    }

    public static void main(String[] args) {
        int x = 4;
        x = modify(x);
        System.out.println(x); // prints 8
    }
}

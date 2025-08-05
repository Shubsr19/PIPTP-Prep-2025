public class Question21 {
    public static int modify(int x) {
        x = x + 10;
        return x;
    }

    public static void main(String[] args) {
        int a = 5;
        modify(a);
        System.out.println(a);
    }
}

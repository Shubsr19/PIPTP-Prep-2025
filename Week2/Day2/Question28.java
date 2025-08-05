public class Question28 {
    public static int fun(int x) {
        int y = x + 10;
        return y;
    }

    public static void main(String[] args) {
        int y = 5;
        int z = fun(y);
        System.out.println(y + " " + z); // prints: 5 15
    }
}

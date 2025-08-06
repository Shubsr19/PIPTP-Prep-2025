public class Question33 {
    static int val = 2; // class-level variable

    public static int mul() {
        val = val * 2;
        return val;
    }

    public static void main(String[] args) {
        System.out.println(mul()); // prints 4
    }
}

public class Question34 {
    public static int recUpdate(int a) {
        if (a > 10) {
            return a;
        }
        return recUpdate(a + 2);
    }

    public static void main(String[] args) {
        System.out.println(recUpdate(4)); // prints 12
    }
}

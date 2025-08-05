public class Question24 {
    static int a = 10;

    public static void test() {
        a = a + 5; 
    }

    public static void main(String[] args) {
        test();
        System.out.println(a); 
    }
}

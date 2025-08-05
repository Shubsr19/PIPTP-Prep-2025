public class Question27 {
    public static void add(int val) {
        val = val + 10; // modifies only local copy
    }

    public static void main(String[] args) {
        int a = 3;
        add(a);
        System.out.println(a); // prints 3
    }
}

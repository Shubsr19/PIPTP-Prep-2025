public class Question13 {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        int z = x * (x - y) % y / x;
        System.out.println("Q13 Output: " + z); // 0
    }
}

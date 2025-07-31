public class ConditionalCheck {
    public static void main(String[] args) {
        int x = 5, y = 10;

        if (!(x > 0 && y < 15)) {
            System.out.println(x + y);  
        } else {
            System.out.println(x * y);  
        }
    }
}

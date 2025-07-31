public class SwitchFallThroughExample {
    public static void main(String[] args) {
        int n = 2;

        switch (n) {
            case 1:
                System.out.println("One");
            case 2:
                n = n + 1; 
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Other");
        }
    }
}

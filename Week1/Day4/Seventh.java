public class Seventh {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
        }
        System.out.println(sum); 
    }
}

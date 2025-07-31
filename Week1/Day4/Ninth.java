public class Ninth {
    public static void main(String[] args) {
        int value = 2;
        int sum = 0;

        while (value <= 10) {
            sum = sum + value;
            value = value + 2;
        }

        System.out.println(sum); 
    }
}

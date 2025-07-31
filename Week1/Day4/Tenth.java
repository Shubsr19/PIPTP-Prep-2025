public class NestedCount {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                count++;
            }
        }
        System.out.println(count); 
    }
}

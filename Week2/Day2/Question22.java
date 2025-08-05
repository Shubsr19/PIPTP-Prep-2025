public class Question22 {
    public static void update(int[] arr, int i) {
        arr[i] = arr[i] + 5;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        update(arr, 1);
        System.out.println(arr[1]);
    }
}

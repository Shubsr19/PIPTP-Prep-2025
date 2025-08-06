public class Question49 { 
    public static int funA(int n) { 
        if (n <= 0) return 0; 
        return n + funB(n - 1); 
    } 

    public static int funB(int n) { 
        if (n <= 0) return 0; 
        return n + funA(n / 2); 
    } 

    public static void main(String[] args) { 
        System.out.println(funA(4)); 
    } 
}
// Output: 19

public class Question39 { 
    public static int mul(int a, int b) { 
    return a * b; 
 } 
    public static int add(int a, int b) { 
    return a + b; 
 } 
    public static void main(String[] args) { 
    int result = mul(add(1, 2), add(2, 3)); 
    System.out.println(result); //prints 15
 } 
} 
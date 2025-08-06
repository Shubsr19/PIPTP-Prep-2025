public class Question46 { 
    public static int f(int x) { 
    return x % 2 == 0 ? x : f(x - 1); 
 } 
    public static void main(String[] args) { 
    System.out.println(f(7)); //prints 6
 } 
} 
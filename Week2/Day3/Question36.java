public class Question36 { 

   public static int add(int a, int b) { 
   return a + b; 
 } 
   public static void main(String[] args) { 
   int x = add(add(2, 3), 4); 
   System.out.println(x); //prints 9
 } 
} 
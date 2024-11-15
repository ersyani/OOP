
package non.interactive;

public class NonInteractive {

        
    public static long factorial(int n) {
        long result = 1;  //factor result start 1
        
        // pengiraan utk factorial iteratively
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 5;  
        
        long factorialResult = factorial(n);
        System.out.println("Factorial of " + n + " is: " + factorialResult);
    }
}

   
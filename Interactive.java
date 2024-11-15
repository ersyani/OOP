
package interactive;

import java.util.Scanner;

public class Interactive {

    // Method mengira  factorial menggunakan iterative approach
    public static long factorial(int n) {
        long result = 1;  // Factorial result starts at 1
        
        // pengiraan utk factorial iteratively
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        
        // bertanye kpd user utk meletakkan number
        System.out.print("Enter a number to calculate its factorial: ");
        try {
            int n = os.nextInt();

            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorialResult = factorial(n);
                System.out.println("Factorial of " + n + " is: " + factorialResult);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        os.close();
    }
    
   }
   


  
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    // Method utk generate Fibonacci series utk number yg diberi
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        int nextNumber;

        System.out.println("Fibonacci up to " + n + ":");
        
        // Print nomber pertama utk dikira
        System.out.println(a);

        // mengeluarkan Fibonacci series 
        while (b <= n) {
            System.out.println(b);
            nextNumber = a + b;
            a = b;
            b = nextNumber;
        }
    }

    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        
        // bertanye kpd user utk neletakkan input
        System.out.print("Enter your number: ");
        try {
            int n = os.nextInt();

            if (n < 0) {
                System.out.println("Please enter a non-negative integer.");
            } else {
                // mengeluarkan fibonnaci nombor
                fibonacci(n);
            }
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        os.close();
    }
}

import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        
        try{

        System.out.print("Enter the first integer: ");
        int num1 = os.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = os.nextInt();

        
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        
        int sub = num1 - num2;
        System.out.println("sub: " + sub);

     
        int multi = num1 * num2;
        System.out.println("multi: " + multi);

        
        int Modulus = num1 % num2;
        System.out.println("Modulus: " + Modulus);
        
        int x = num1;
        ++x;
        System.out.println("Increment :"+x);
        
        int y = num2;
        --y;
        System.out.println("Decrement :"+y);
        

        os.close();
    }
    
    catch (ArithmeticException ae)
        {System.out.println("attempt to divide by 0");}
        System.out.println("after catch");
    }
}

        


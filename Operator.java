package operator;

import java.util.Scanner;

public class Operator {
    
    public static void main(String args[]) {
        Scanner os = new Scanner(System.in);
        
        // letak Declare variables
        char operator;
        double num1, num2, result;
        
        // memintak user meletakkan input
        System.out.println("Enter your operator ( +, -, * or / ):  ");
        operator = os.next().charAt(0);
        
        System.out.println("Enter your first number:  ");
        num1 = os.nextDouble();
        
        System.out.println("Enter your second number: ");
        num2 = os.nextDouble();
        
        // Calculate and output result using switch
        switch(operator) {
            case '+': {
                result = num1 + num2;
                result = Math.round(result * 100.0) / 100.0;//mengunakan math.round utk mencari berapa titik puluhan
                System.out.printf("Addition: %.2f\n", result);
                break;
            }
            
            case '-': {
                result = num1 - num2;
                result = Math.round(result * 100.0) / 100.0;
                System.out.printf("Subtraction: %.2f\n", result);
                break;
            }
             
            case '*': {
                result = num1 * num2;
                result = Math.round(result * 100.0) / 100.0;
                System.out.printf("Multiply: %.2f\n", result);
                break;
            }
            
            case '/': {
                result = num1 / num2;
                result = Math.round(result * 100.0) / 100.0;
                System.out.printf("Divide: %.2f\n", result);
                break;
            }
            
            default: {
                System.out.println("Invalid operator");
                break;
            }
        }
        
        os.close();
    }
}

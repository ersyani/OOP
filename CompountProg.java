import java.util.Scanner;

public class CompountProg {
    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        
        int num1, x , a , y, c ;
        System.out.print("Enter the first integer: ");
        num1 = os.nextInt();

        x = num1;
        x = ++x;
        System.out.println("Prefix Increment :"+x);
        
        a = num1;
        a = a++;
        System.out.println("Postfix Increment :"+a);
        
        y = num1;
        y = --y;
        System.out.println("Prefix Decrement :"+y);
        
        c = num1;
        c = c--;
        System.out.println("Postfix Decrement :"+c);
        

        os.close();
    }
}

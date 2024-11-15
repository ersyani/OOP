
package usingorexit;

import java.util.Scanner;

public class UsingorExit {

    public static void main(String[] args) {
        
       int num ;
       int sum = 0;
       String input;
       
       Scanner os = new Scanner (System.in);
       
       do{
       //output akan mengeluarkan power intger dari 1-10
        System.out.println("The power of integers 1-10 : ");
        
        //pengiraan utk mendapat kan power dan jumlahnyee
        for (int i =1; i<= 10; i++){
            num = i*i;
            System.out.println(i + "^2 =" +num);
            sum += num;
        }
        
        //output akn mengeluarkan jumlah power yg ada
        System.out.println("\nSum of power of intergers 1-10 : " + sum);
        
        //user perlu menjawab soalan utk meneruskan atau tidak
        System.out.println("Do you want to continue? (Y or N ): ");
        input = os.nextLine();
        
       } while (input.equalsIgnoreCase("Y"));
        
        System.out.println("Program exited.");

        os.close();
    }
}


    

package evenandodd;

import java.util.Scanner;

public class Evenandodd {

    public static void main(String[] args) {
       
        Scanner os = new Scanner(System.in);
        String choice;
        int even = 0;
        int odd = 0;

        do {
            System.out.print("Enter sequence of integer : ");
            //User perlu meletakkan input yg diminta
            
            String input = os.nextLine();
            
            String[] numbers = input.split(" ");
            //menjarakkan number yg di letakkan 
            
            //formula utk pengiraan input
            for (String num : numbers) {
                
                int number = Integer.parseInt(num);
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            //nomber akan dispaly mengikut output yg ada
            System.out.println("Even Number : " + even);
            System.out.println("Odd Number : " + odd);
            
            
            //pertanye kepada user utk end atau teruskan   
            System.out.print("Do you want continue ? (yes or no ): ");
            choice = os.nextLine();
            
        } while (choice.equalsIgnoreCase("yes"));
        
        System.out.println("Program exited.");

        os.close();
    }
}


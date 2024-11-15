package mark;

import java.util.Scanner;

public class Mark {
    
    public static void main (String args []){
        Scanner os = new Scanner(System.in);
        
        int mark;
             //meminta user memasukkan input
             System.out.print("Enter your mark :");
             mark = os.nextInt();
             os.close();
                     
             //pengiraan utk mengeluarkan output
             if (mark >= 80){
                 System.out.println(" Your grade is A ");
             }
             else if (mark >= 60){
                 System.out.println("Your grade is B");
             }
             else if (mark >= 40){
                 System.out.println("Your grade is C");
             }
             else if (mark < 40 ){
                 System.out.println("Your grade is F");
             }
    }
    
}


package password;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        
        String correctpassword = "123";
        int max = 3;
        String enterpassword;
        boolean access = false;//memanggil veriable 
        
        Scanner os = new Scanner(System.in);
        
        
        
        for(int i = 1; i <=max; i++){//formula utk looping max yg diminta
            System.out.print("Enter your password :");//user meletakkan input yg diminta
            enterpassword = os.nextLine();//
            
            if (enterpassword.equals(correctpassword)){//this is for comparing statment 12
                access = true;
            }else {
                System.out.println("incorrect password");
            }
        }
        
        
        if (access) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }

        os.close();
        
        
        
        
        
    }
    
}

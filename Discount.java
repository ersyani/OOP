package discount;


import java.util.Scanner;

public class Discount {
    
    public static void main (String args []){
        Scanner os = new Scanner (System.in);
        
        //call the variables
        String color , item ;
        double discount , price , totalprice , finalprice;
        int quantity, discountrate = 0;
        
        //accept user input 
        System.out.println("Choose yor color (blue,red,green):");
        color = os.nextLine();
        
        System.out.println("Enter Item Name :");
        item = os.nextLine();
        
        System.out.println("Enter Price perItem:");
        price = os.nextDouble();

        System.out.println("Enter Quantity :");
        quantity = os.nextInt();
        
        
        //pengiraan discount utk pengeluaran output
        switch (color){
            
             case "blue" : discountrate = 10;break;
            
            
             case "red" :discountrate = 20;break;
            

              case "green" :discountrate = 30;break;
            
             
             default : System.out.println("Invalid choice ");break;
             
            
            
        }
        //pengiraan utk total discount
        totalprice = price * quantity ;
        discount = ( discountrate / 100 )* totalprice ;
        finalprice = totalprice - discount ;
        
        
        //display the output  
        System.out.println(" item  :"+item);
        System.out.println(" price  :"+price);
        System.out.println(" quantity  :"+quantity);
        System.out.println(" total price  :"+totalprice);
        System.out.println(" discount rate  :"+discountrate + "%");
        System.out.println(" price after discount :"+finalprice);


        
        
    }
    
}


    
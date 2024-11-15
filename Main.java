package price;

import java.util.Scanner;

public class Main

{

public static void main(String[] args) {

    Scanner os =new Scanner(System.in);
    float price,quantity,totalcost,discount ,afterdiscount,discountrate;
    String item;
    
     System.out.println(" Item = ");
    item = os.nextLine();

     System.out.println("Enter price : ");

        price=os.nextInt();

         System.out.println("Enter quantity: ");

        quantity=os.nextInt();

        totalcost=quantity*price;
        
        System.out.println("Enter discount rate (%):");
        discountrate = os.nextInt();
                
        discount= discountrate/100;

        afterdiscount =totalcost-( totalcost*discount);
        
     
    System.out.println(" Item :"+item );
    System.out.println("Price of one Item= "+price);
    System.out.println("Total Price = "+totalcost);
    System.out.println("discount = "+discountrate +("%"));
    System.out.println("price after discount = "+afterdiscount);

}

}



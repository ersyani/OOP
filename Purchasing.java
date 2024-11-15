package purchasing;

import java.util.Scanner;

public class Purchasing {
    
    public static void main(String[] args) {
        
        Scanner os = new Scanner(System.in);

        //put the variables
        String itemName;
        int quantity;
        double price;
        double totalCost = 0;

        System.out.println("Welcome to the Order System!");

        // Accept user input
        System.out.print("Enter the item name: ");
        itemName = os.nextLine();

        System.out.print("Enter the quantity: ");
        quantity = os.nextInt();

        System.out.print("Enter the price per item: ");
        price = os.nextDouble();

        // Calculate total cost
        totalCost = quantity * price;

        // display output
        System.out.println("Order Summary:");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total cost: " + totalCost);

        

        
        os.close();
    }
}


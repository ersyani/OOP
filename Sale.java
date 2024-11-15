
package sale;

import java.util.Scanner;

public class Sale {

    public static void main(String[] args) {
        
        String name;
        int quantity1, quantity2;
        double totalprice1, totalprice2;
        double price1, price2;
        double totalSales;
        double commission;
        double salary;//memanggil veriable yg ada
        
        Scanner os = new Scanner(System.in);
        
        
        System.out.print("Enter your first item: ");
        name = os.nextLine();
        System.out.print("Enter item price: ");
        price1 = os.nextDouble();
        System.out.print("Enter quantity: ");//user perlu meletakkan input yg diperlukan
        quantity1 = os.nextInt();
        
        totalprice1 = price1 * quantity1;
        System.out.printf("Total price for first item = RM %.2f\n", totalprice1);
        //pengiraan utk mencari jumlah jualan
        
        os.nextLine(); 
        
        
        System.out.print("Enter your second item: ");
        name = os.nextLine();
        System.out.print("Enter item price: ");
        price2 = os.nextDouble();
        System.out.print("Enter quantity: ");
        quantity2 = os.nextInt();
        
        totalprice2 = price2 * quantity2;
        System.out.printf("Total price for second item = RM %.2f\n", totalprice2);
        
        // Calculate total sales, commission, and salary
        totalSales = totalprice1 + totalprice2;
        commission = totalSales * 0.05;
        salary = 600 + commission;//pengiraan utk mencari total sales,commion dan salary
        
        //mengeluarkan output 
        System.out.printf("\nTotal Sales: RM %.2f\n", totalSales);
        System.out.printf("Commission: RM %.2f\n", commission);
        System.out.printf("Total Salary: RM %.2f\n", salary);
    }
}

   

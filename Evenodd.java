package evenodd;
public class Evenodd {
            public static void main(String[] args) {

        int evenSum = 0;
        int oddSum = 0;
        
       
        System.out.println("Even number 1 - 10 :");//mengeluarkan kesemua nombor even number dari 1 hingga 10
        for (int i = 1; i <=10; i++){ //untuk menggeluarkan looping
            if(i %2 == 0){ //formulan untuk mencari even number 
                System.out.print(" "+ i);//mengeluarkan output untuk even number
                evenSum += i; //mengira jumlah kesemua nombor even number
                
            }
        }
        System.out.println("\nSum even number is " +evenSum);
        //mengeluarkan output utk jumlah even number
        
        System.out.println("\nOdd number 1 - 10 :");//mengeluarkan semua odd number dari 1 hingga 10 
        for (int j = 1; j <= 10; j++){
            if(j %2 != 0 ){ //formula untuk mengeluarkan odd number 
                System.out.print(" "+j);
                oddSum += j; //mengira jumlah semua odd number
            }
        }
        
        
        System.out.println("\nSum odd number is " +oddSum);
        //mengeluarkan output utk jumlah odd number
        
        
    }
}
    

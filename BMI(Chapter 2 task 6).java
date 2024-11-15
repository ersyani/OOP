import java.util.Scanner;

public class BMI {
    
   public static void main(String args[]) {
       
      Scanner os = new Scanner(System.in);
       float weight,height,BMI;
      
      System.out.print("Input weight in kilogram: ");
      weight = os.nextFloat();
      
      System.out.print("Input height in meters: ");
      
      height = os.nextFloat();
      BMI = weight/(height * height);
      
      System.out.println("The BMI is " +BMI);
   }
}

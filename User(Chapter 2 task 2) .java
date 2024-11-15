import java.util.Scanner;

public class User{
    public static void main(String[] args) {
        String name, hobby, fvfood ;
        int age ;
        
        Scanner os = new Scanner (System.in);
        
        System.out.println("Enter your name :");
        name = os.nextLine();
       
        System.out.println("Enter your age :");
        age = os.nextInt();
        
        os.nextLine();
        
        System.out.println("Enter your hobby :");
        hobby = os.nextLine();
        
        System.out.println("Enter your Fv food :");
        fvfood = os.nextLine();
        os.close();
        
        
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Hobby :"+hobby);
        System.out.println("Fv food :"+fvfood);
        
        
        
    }
}

import java.util.Scanner;
public class Marks{
    
        public static void main(String[] args) {
            
        Scanner os = new Scanner(System.in);
        String name,id, subject;
        int marks,test1,test2; 
        
        
        try{
     
        System.out.println("Enter your name :");
        name = os.nextLine();
        
        System.out.println("Enter your id :");
        id = os.nextLine();
        
        System.out.println("Enter your subject :");
        subject = os.nextLine();
        
        System.out.print("Insert your test1: ");
        test1 = os.nextInt();

        System.out.print("Insert your test2: ");
        test2 = os.nextInt();

        
        marks = (test1 + test2)/2;
        System.out.println("marks: " +marks);
        
        
        System.out.println("Name : " +name);
        System.out.println("Id :  " +id);
        System.out.println("Subject: " +subject);
        System.out.println("average marks : " +marks);
        
        }
        catch (ArithmeticException ae)
        {System.out.println("attempt to divide by 0");}
        System.out.println("after catch");
       
    }
}

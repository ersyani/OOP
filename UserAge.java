package userage;


import java.util.Scanner;
public class UserAge{
    
        public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        int currentyear, age, birthyear; 
        currentyear = 2024;
     
        System.out.println("Insert your birthyear :");
        birthyear = os.nextInt();
        age = currentyear - birthyear ;
        System.out.println("Birthyear: " + birthyear);
        System.out.println("Current year: 2024 ");
        System.out.println("Age: " + age);
    }
}

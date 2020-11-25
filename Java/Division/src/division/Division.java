package division;
import java.util.Scanner;

public class Division {
   public static void main(String[] args) {
       int num1, num2, result;
       Scanner obj1 = new Scanner(System.in);
       try {
           System.out.println("Enter the 1 number");
           num1 = obj1.nextInt();
           System.out.println("Enter the 2 number");
           num2 = obj1.nextInt();
           result = num1 / num2;
           System.out.println("The reslut is " + result);
       } 
     //  catch (Exception e) {
      //     System.out.println("Please input only numeric values..!!");
      // }
       catch(ArithmeticException e)
       {
           System.out.println("Division performed by zero...");
       }

    }
    
}

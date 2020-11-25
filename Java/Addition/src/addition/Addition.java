package addition;
import java.util.Scanner;
  public class Addition {
      
   public static void main(String[] args) {
       int num1, num2, result;
       String snum1, snum2;
       Scanner obj1 = new Scanner(System.in);
       try{
          System.out.println("Enter  the 1 number");
          snum1 =  obj1.next();
     //  num1 = obj1.nextInt();
          System.out.println("Enter the 2 number");
          snum2 = obj1.next();
      // num2 = obj1.nextInt();
          num1 = Integer.parseInt(snum1);
          num2 = Integer.parseInt(snum2);
          result = num1 + num2;
          System.out.println("The result is " + result); 
       }
      catch(Exception e) 
      {
          System.out.println("Please input only numeric values...!!");
      }
    }
}

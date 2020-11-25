package rethrowexception;

public class RethrowException {
     static void compute()
     {
         try {
             throw new RuntimeException("My Exception");
         } 
         catch (RuntimeException e) {
             System.out.println("Exception caught in compute() method");
             throw e;
         }
     }
     public static void main(String[] args) {
         try {
             compute();
         } 
         catch (RuntimeException e) {
             System.out.println("Exception caught:" + e);
         }
    }
}

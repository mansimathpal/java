package mainthreaddemo;

public class MainThreadDemo {
    public static void main(String[] args) {
       Thread t = Thread.currentThread();
        System.out.println("The current thread: " + t);
        t.setName("MainThread");
        System.out.println("The current thread after name change: " + t);
        System.out.println("The current thread is going to sleep after for 10 seconds");
        try {
         t.sleep(10000);   
        } 
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("After 10 seconds.........the current thread is existing now");
    }
}

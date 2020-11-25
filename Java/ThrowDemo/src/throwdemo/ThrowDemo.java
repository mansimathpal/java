package throwdemo;

public class ThrowDemo {
    void display()
    {
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        ThrowDemo obj1 = new ThrowDemo();
        try {
            obj1.display();
        } 
        catch (Exception e) {
            System.out.println("Runtime Exception raised");
            throw e;
        }
    }
}

package methodlocalinner;

public class MethodLocalInner {
    private String x = "MyOuterClass";
    
    void display()
    {
       final String z = "local variable";
        System.out.println("x");
        
        class Inner
        {
            public void print()
            {
                System.out.println("Outer x: " + x);
                System.out.println("Local variable z: " + z);
            }
        }
        Inner obj = new Inner();
        obj.print();
    }
    
    public static void main(String[] args) {
        MethodLocalInner m = new MethodLocalInner();
        m.display();
    }
}

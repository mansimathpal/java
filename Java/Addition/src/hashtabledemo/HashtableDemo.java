package hashtabledemo;
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, Double> obj = new Hashtable<Integer, Double>();
        Double dobj1 = new Double(55.6);
        Double dobj2 = new Double(34.6);
        Double dobj3 = new Double(98.6);
        Double dobj4 = new Double(12.5);
        
        System.out.println("Size of Hashtable is: " + obj.size());
        
        obj.put(55, dobj1);
        obj.put(60, dobj2);
        obj.put(65, dobj3);
        obj.put(70, dobj4);
        obj.put(75, dobj3);
        
        System.out.println("\nHashtable after adding the objects: " + obj);
        System.out.println("Size of Hashtable after adding the objects: " + obj.size());
        
        obj.remove(65);
        obj.remove(75);
        
        System.out.println("\nHashtable after removing the objects: " + obj);
        System.out.println("Size of Hashtable removing the objects: " + obj.size());
    }
}

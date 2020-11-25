package datedemo;
//import java.text.DateFormat;
//import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
//import java.util.Currency;
//import java.text.NumberFormat;

public class DateDemo {
    public static void main(String[] args) {
        Locale l1 = new Locale("de", "DE");
        ResourceBundle rb1 = ResourceBundle.getBundle("MessageBundle", l1);
        System.out.println(rb1.getString("message"));
        Locale l2 = new Locale("zn", "ZN");
        ResourceBundle rb2 =  ResourceBundle.getBundle("MessageBundle", l2);
        System.out.println(rb2.getString("message"));
        // NumberFormat nft = NumberFormat.getCurrencyInstance(new Locale("de", "DE"));
       // String formatted = nft.format(1000000);
       // System.out.println(formatted);
      //  DateFormat df = DateFormat.getTimeInstance(DateFormat.LONG, new Locale("de", "DE"));
      //  String time = df.format(new Date());
      //  System.out.println(time);
      // DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("de", "DE"));
       // String date = df.format(new Date());
       // System.out.println(date);
    }
}

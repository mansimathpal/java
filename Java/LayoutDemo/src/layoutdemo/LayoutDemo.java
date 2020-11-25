package layoutdemo;
//import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
import javax.swing.BoxLayout;

public class LayoutDemo extends JFrame{
   // JButton add, update, delete, reset;
   // JButton red, blue, green, black, white, cyan;
   // JButton red, blue, green;
    JButton red, blue, green, black, white, cyan;
    
    public LayoutDemo()
    {
        red = new JButton("Red");
        blue = new JButton("Blue");
        green = new JButton("Green");
        black = new JButton("Black");
        white = new JButton("White");
        cyan = new JButton("Cyan");
       // red = new JButton("Red");
       // blue = new JButton("Blue");
       // green = new JButton("Green");
      //  add = new JButton("Add");
      //  update = new JButton("Update");
      //  delete = new JButton("Delete");
      //  reset = new JButton("Reset");
       // red = new JButton("Red");
      //  blue = new JButton("Blue");
      //  green = new JButton("Green");
      //  black = new JButton("Black");
      //  white = new JButton("White");
      //  cyan = new JButton("Cyan");
        
        setVisible(true);
        setSize(300, 300);
        setTitle("Flow Layout");
        
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        add(red);
        add(blue);
        add(green);
        add(black);
        add(white);
        add(cyan);
      //  setLayout(new GridBagLayout());
      //  GridBagConstraints c = new GridBagConstraints();
      //  c.gridx = 0;
      //  c.gridy = 0;
      //  add(red, c);
      //  c.gridx = 1;
      //  c.gridy = 1;
      //  add(blue, c);
      //  c.gridx = 2;
      //  c.gridy = 2;
      //  add(green, c);
       // setLayout(new GridLayout(2, 3));
      //  add(red);
       // add(blue);
      //  add(green);
      //  add(black);
      //  add(white);
      //  add(cyan);
        
       // setLayout(new FlowLayout());
       // add(add);
       // add(update);
       // add(delete);
       // setLayout(new BorderLayout());
       // add(add, BorderLayout.NORTH);
      //  add(update, BorderLayout.SOUTH);
      //  add(delete, BorderLayout.EAST);
      //  add(reset, BorderLayout.WEST);
    }
    public static void main(String[] args) {
      LayoutDemo obj = new LayoutDemo();
    }
}

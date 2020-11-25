package groupLayoutDemo;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GroupLayoutDemo extends JFrame{
    JButton red, blue, green, black;
    
    public GroupLayoutDemo()
    {
        red = new JButton("Red");
        blue = new JButton("Blue");
        green = new JButton("Green");
        black = new JButton("Black");
        
        setVisible(true);
        setSize(300, 500);
        setTitle("GroupLayout");
        
        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        GroupLayout.SequentialGroup sg = layout.createSequentialGroup();
        GroupLayout.ParallelGroup pg = layout.createParallelGroup();
        
        pg.addComponent(red);
        pg.addComponent(blue);
        
        GroupLayout.ParallelGroup pg1 = layout.createParallelGroup();
        pg1.addComponent(green);
        pg1.addComponent(black);
        
        sg.addGroup(pg);
        sg.addGroup(pg1);
        
        GroupLayout.SequentialGroup sg1 = layout.createSequentialGroup();
        GroupLayout.ParallelGroup pg3 = layout.createParallelGroup();
        
        pg3.addComponent(red);
        pg3.addComponent(green);
        
        GroupLayout.ParallelGroup pg4 = layout.createParallelGroup();
        pg4.addComponent(blue);
        pg4.addComponent(black);
        
        sg1.addGroup(pg3);
        sg1.addGroup(pg4);
        
        layout.setHorizontalGroup(sg);
        layout.setVerticalGroup(sg1);
    }
    
    public static void main(String[] args) {
        GroupLayoutDemo obj = new GroupLayoutDemo();
    }
}

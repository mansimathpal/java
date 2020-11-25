package labeldemo;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import javax.swing.JTextArea;
//import javax.swing.JCheckBox;
//import javax.swing.JRadioButton;
//import javax.swing.ButtonGroup;
//import javax.swing.DefaultListModel;
//import javax.swing.JList;
//import javax.swing.JComboBox;
//import javax.swing.JButton;
import javax.swing.JOptionPane;

public class LabelDemo extends JFrame{
      // JPanel jPanel;
      // JButton submit, cancel;
      // JComboBox city;
      // JList list;
      // DefaultListModel dList;
      // JRadioButton male, female;
      // ButtonGroup bg;
     //  JCheckBox h1, h2, h3;
      // JTextArea about, exp;
      // JTextField firstName, lastName;
      // JLabel firstName, lastName;
       
       public LabelDemo()
       {
           JOptionPane.showConfirmDialog(this, "Do you want to save it?", "Confirmation Message" ,
                   JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
          // jPanel = new JPanel();
          // submit = new JButton("Submit");
          // cancel = new JButton("Cancel");
          // city = new JComboBox();
          // city.addItem("California");
         //  city.addItem("Florida");
         //  city.addItem("Montanan");
         //  city.addItem("New York");
         //  city.addItem("Oklahoma");
          //  list = new JList();
         //  list.setSelectedIndex(0);
         //  dList = new DefaultListModel();
         //  dList.addElement("California");
         //  dList.addElement("Florida");
         //  dList.addElement("Montana");
         //  dList.addElement("New York");
          // dList.addElement("Oklahoma");
         //  list.setModel(dList);
         //  male = new JRadioButton("Male");
         //  female = new JRadioButton("Female");
         //  bg = new ButtonGroup();
         //  bg.add(male);
         //  bg.add(female);
          // h1 = new JCheckBox("Music");
          // h2 = new JCheckBox("Sports");
          // h3 = new JCheckBox("Painting");
         //  about = new JTextArea(5,20);
         //  firstName = new JTextField();
         //  firstName.setText("Mansi");
         //  lastName = new JTextField();
         //  lastName.setText("Mathpal");
         //  jPanel.add(city);
         //  jPanel.add(male);
          // jPanel.add(female);
          // jPanel.add(h1);
          // jPanel.add(h2);
          // jPanel.add(h3);
         //  jPanel.add(firstName);
         //  jPanel.add(lastName);
         //  firstName = new JLabel("First Name");
         //  lastName = new JLabel("Last Name");
          // jPanel.add(submit);
          // jPanel.add(cancel);
          // jPanel.add(list);
          // jPanel.add(about);
         //  jPanel.add(firstName);
         //  jPanel.add(lastName);
           setTitle("JLabel Demo");
           setVisible(true);
           setSize(500, 200);
          // add(jPanel);
       }

    public static void main(String[] args) {
        LabelDemo pd = new LabelDemo();
    }
}

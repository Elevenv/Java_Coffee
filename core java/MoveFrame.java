
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MoveFrame extends JFrame
{
JLabel label=new JLabel();
JTextField text=new JTextField(20);
JPanel panel=new JPanel(new GridLayout(2,2));
JButton button1 =new JButton("OK");
JButton button2 =new JButton("Next");

public MoveFrame()
{
label.setText("Enter Name:");
panel.add(label);
panel.add(text);
panel.add(button1);
panel.add(button2);
add(panel,BorderLayout.CENTER);
button1.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent ae)
{
JOptionPane.showConfirmDialog(null, "Are you Confirm?");
}
});
button2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
String value=text.getText();
JLabel label1=new JLabel("Welcome: "+value);
JPanel pan=new JPanel();
pan.add(label1);
JFrame frame1 = new JFrame();
frame1.setVisible(true);
frame1.add(pan);
frame1.setSize(250,100);

}
});
}
public static void main(String arg[]){ 
MoveFrame frame=new MoveFrame();
frame.setSize(300,100);
frame.setVisible(true);
}
}
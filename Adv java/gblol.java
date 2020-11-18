import java.awt.*;
public class gblol extends Frame
{
gblol()
{
GridBagLayout gb = new GridBagLayout();
 GridBagConstraints gc = new GridBagConstraints();
setSize(400,400);
setVisible(true);
setLayout(gb);
Button b1= new Button("Button One ");
 Button b2= new Button("Button two");
 Button b3= new Button("Button Three");
 Button b4= new Button("Button Four");
 Button b5= new Button("Button Five");
 gc.insets = new Insets(0,0,0,0);
gc.gridx=0;
 gc.gridy=0;
 add(b1,gc);
gc.gridx=2;
gc.gridy=0;
add(b2,gc);
gc.fill = GridBagConstraints.VERTICAL;
gc.ipady=20;
gc.gridx=0;
gc.gridy=2;
add(b3,gc);
gc.gridx=2;
gc.gridy=2;
add(b4,gc);
gc.fill= GridBagConstraints.HORIZONTAL;
gc.gridwidth=4;
gc.gridx=0;
gc.gridy=4;
add(b5,gc);
 }
public static void main(String args[])
{
gblol g = new gblol();
}
}

import javax.swing.*;
import java.awt.event.*;
class jprogress extends JFrame implements ActionListener {
    //public static final long serialVersionUID = 2L;
    JProgressBar jb;
    int i = 0 ;
    jprogress()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        jb = new JProgressBar(0,100);
        jb.setBounds(200,200,100,40);
        add(jb);
        jb.setStringPainted(true);
        JButton butt = new JButton("Start");
        butt.addActionListener(this);
        butt.setBounds(200,250,70,30);
        add(butt);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    public void actionPerformed(ActionEvent e)
    {
      iterate();
    }
    public void iterate()
    {
        while(i<=100)
        {
            jb.setValue(i);
            i = i + 20;
            try 
            {
                Thread.sleep(150);
            } 
            catch (Exception e) 
            {
               //System.out.println("Idk check your code lol");
            }
        }
    }
     public static void main(String args[]){
         new jprogress();
    }
}
